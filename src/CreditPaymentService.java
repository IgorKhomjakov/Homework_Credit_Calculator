public class CreditPaymentService {

    public double calculate(int amount, double percent, int term) {
        return amount * (((percent / 12 / 100) * (Math.pow(1 + (percent / 12 / 100), term))) /
                ((Math.pow(1 + (percent / 12 / 100), term)) - 1));

    }

}
