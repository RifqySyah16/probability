public class Probability {
    private final double value;

    public Probability(double value) {
        this.value = value;
    }

    public Probability complement() {
        final double maxChance = 1;
        final double newValue = maxChance - this.value;

        return new Probability(newValue);
    }

    public int compareTo(Probability otheProbability) {
        final int greaterThan = 1;
        final int lessThan = -1;
        final int equal = 0;
        if (this.value > otheProbability.value) {
            return greaterThan;
        }
        if (this.value < otheProbability.value) {
            return lessThan;
        }

        return equal;
    }

    public Probability and(Probability otherProbability) {
        return new Probability(this.value * otherProbability.value);
    }

    @Override
    public String toString() {
        return "Probability [value=" + value + "]";
    }
}