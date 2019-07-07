public class Collatz {
    static int count = 0;

    public static void Collatz(double n) {
        if (n == 1) {
            //count++;
            return;
        } else {
            count++;
            if (n % 2 == 0) Collatz(n / 2);
            else Collatz(3 * n + 1);
        }
    }

    public static void main(String[] args) {
        int Toplen = 0;
        double Topnum = 0;
        for (double i = 1; i < 1000000; i++) {
            Collatz(i);
            if (count > Toplen) {
                Toplen = count;
                Topnum = i;
            }
            count = 0;
        }
        System.out.println("max lenght " + Toplen + " for number " + Topnum);
    }
}
