public class Task2 {

    public static void main(String[] args) {
        double val = 4.0;
        double delta = 0.001;
        Sqrt sqrt = new Sqrt(val, delta);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + " with delta " + delta + " = " + result);
    }
}

class Sqrt {
    /*creating class with variables delta and arg*/
    double delta;
    double arg;
    public Sqrt(double arg, double delta) {         //constructor, that get two args
        this.arg = arg;
        this.delta = delta;
    }

    double average(double x, double y) {
        return (x + y) / 2.0;
    }

    boolean good(double guess, double x) {
        return Math.abs(guess * guess - x) < delta;
    }

    double improve(double guess, double x) {
        return average(guess, x / guess);
    }

    double iter(double guess, double x) {
        if (good(guess, x))
            return guess;
        else
            return iter(improve(guess, x), x);
    }

    public double calc() {                          //this method is public because we call it from main
        return iter(1.0, arg);
    }
}