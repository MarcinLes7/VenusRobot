import java.text.DecimalFormat;
import java.util.Locale;

public class Vars1 {
    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        // typ podstawowy
        int a = 6;

        // klasa
        VenusRobot robot;

        // tablica
        String[] streets = {"Floianska", "Batorego", "Wiślna"};

        final double PI = 3.14;
        final int A;
        A = 4;

        final String NAME = "Jakaś nazwa";

        double z = 0.0000000d;
        System.out.println(z);
        System.out.printf("%.5f", z);
        System.out.println("---");

        double aa = 2.432E-17;
        System.out.println(aa);
        System.out.printf(new Locale("us"), "%.19f", aa);

        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println(df.format(aa));

        int jackpot = 3_500_000;

        int val = 0b101;


    }
}
