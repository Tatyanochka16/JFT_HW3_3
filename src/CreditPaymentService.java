public class CreditPaymentService {
    public double payment(int creditSum, float percent, int years) {
        int n = years * 12;
        double p = percent / 12 / 100;
        double f = Math.pow((1 + p), n);
        double k = (p * f) / (f - 1);
        double result = creditSum * k;
        return result;
    }
}
