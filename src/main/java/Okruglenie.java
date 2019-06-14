import java.text.DecimalFormat;

class SqrT {
    double delta = 0.001;
    double args;

    SqrT(double arg) {
        this.args = arg;
    }

    double average(double x, double y) {
        return (x + y) / 2.0;
    }

    boolean good(double guess, double x) {
        return Math.abs(guess * guess - x) < delta;
    }

    double improive(double guess, double x) {
        return average(guess, x / guess);
    }

    double iter(double guess, double x) {
        if (good(guess, x))
            return guess;
        else
            return iter(improive(guess, x), x);
    }

    public String calc(String znak) {
        double res = iter(1.0, args);
        String formattedDouble = new DecimalFormat(znak).format(res);
        return formattedDouble;
    }
}

public class Okruglenie {
    public static void main(String[] args) {
        // double val = Double.parseDouble(args[0]);
        double val = 1.22;
        SqrT sqrt = new SqrT(val);
        String result = sqrt.calc("#0.00000");
        System.out.println("Sqrt of " + val + " = " + result);

    }

}

