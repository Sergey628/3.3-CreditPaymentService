public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();

        double option1 = calculator.calculete(1_000_000, 9.99, 12);
        System.out.println(" Вариант 1 ежемесячный платеж " + option1);

        double option2 = calculator.calculete(1_000_000, 9.99, 24);
        System.out.println(" Вариант 2 ежемесячный платеж " + option2);

        double option3 = calculator.calculete(1_000_000, 9.99, 36);
        System.out.println(" Вариант 3 ежемесячный платеж " + option3);

    }
}

