import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService monthlyPayment = new CreditPaymentService();
        int creditSum = 1_000_000; // Обозначила здесь, так как это данные со скриншота, можно удалить, оставив лишь тип и имя переменной
        float percent = 9.99F; // Обозначила здесь, так как это данные со скриншота, можно удалить, оставив лишь тип и имя переменной
        int years;
        System.out.println("На 1 год:");
        System.out.println("Ежемесячный платеж составит: " + (int) monthlyPayment.payment(creditSum, percent, 1));

        System.out.println("На 2 года:");
        System.out.println("Ежемесячный платеж составит: " + (int) monthlyPayment.payment(creditSum, percent, 2));

        System.out.println("На 3 года:");
        System.out.println("Ежемесячный платеж составит: " + (int) monthlyPayment.payment(creditSum, percent, 3));
    }
}
