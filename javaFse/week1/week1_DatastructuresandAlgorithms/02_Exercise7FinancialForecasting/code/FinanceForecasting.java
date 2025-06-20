
public class FinanceForecasting {

    public static double futurePrediction(int yrs, double amt, double gr) {
        if (yrs == 0) {
            return amt;
        }
        return futurePrediction(yrs - 1, amt, gr) * (1 + gr / 100);
    }

    public static void main(String[] args) {
        int yrs = 5;
        double amt = 5000;
        double growthrate = 2;
        System.out.println(futurePrediction(yrs, amt, growthrate));
    }
}
// Time Complexity: O(n)
// iterate using for loop would be more optimzed for computation(when input is large)
