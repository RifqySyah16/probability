public class App {
    public static void main(String[] args) {
        Probability headToss = new Probability(0.5);
        Probability tailToss = new Probability(0.5);
        headToss.complement();
        headToss.compareTo(tailToss);

        headToss.and(tailToss);
        System.out.println(headToss.and(tailToss));
    }
}