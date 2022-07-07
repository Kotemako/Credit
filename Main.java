public class CreditPaymentService {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double Sum = 1_000_000;
        double Year = 12;
        double Proc = 9.99 / Year;
        double Credit = service.calculate(Proc, Year);
        double D = (int) (Credit*Sum);
        System.out.println("Месячный платеж: " + D);
        }
    }
}