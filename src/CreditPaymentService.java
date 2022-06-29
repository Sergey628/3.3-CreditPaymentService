public class CreditPaymentService {
    public double calculete(double credit, double annualInterest, double months) {
        double interestRate = (annualInterest / 12) / 100;
        double monthPercent = 1 + interestRate;
        double derivative = Math.pow(monthPercent, months);
        double annuityRatio = (interestRate * derivative) / (derivative - 1);
        double result = annuityRatio * credit;
        int x = (int) result;
        return x;
    }
}
