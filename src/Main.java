public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        int amount = 1_000_000; // сумма кредита
        double percent = 9.99;  // процентная ставка
        int term = 12;  // срок кредита
        double payment = service.calculate(amount, percent, term);
        System.out.println((int) payment);

        System.out.println();
        System.out.println("Срок кредита 12 месяцев");
        System.out.println((int) service.calculate(1_000_000, 9.99, 12));


        System.out.println();
        System.out.println("Срок кредита 24 месяцев");
        System.out.println((int) service.calculate(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("Срок кредита 36 месяцев");
        System.out.println((int) service.calculate(1_000_000, 9.99, 36));


    }
}
