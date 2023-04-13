public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 95;
        double growthMetr = 1.88;
        int BMI = service.calculate(weightKg, growthMetr);
        System.out.println(BMI);

    }
}
