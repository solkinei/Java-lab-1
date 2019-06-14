public class Task2 {
    public static void main(String[] args) {
        double val = 25; //Double.parseDouble(args[0]);
        double delta = 0.0001; //Double.parseDouble(args[1]);
        Sqrt sqrt = new Sqrt(val, delta);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + "=" + result);
    }
}