public class BmiService {
    public int calculate(int weightKg, double growthMetr) {
        double result = weightKg / (growthMetr * growthMetr);
        return (int) result;
    }
}