public class CreditPaymentService {

    public double calculate(double Proc, double Year) {
        double Credit;
        double Proc1 = Math.pow (1 + Proc, Year);

        return Credit = (Proc * Proc1) / (Proc1 - 1);

    }
}
