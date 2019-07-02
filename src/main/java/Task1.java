public class Task1 {
    public static long Collatz(long n) {
        if (n > 1) {
            if (n % 2 != 0)
                return (1 + Collatz(3 * n + 1));
            else
                return (1 + Collatz(n / 2));
        } else
            return 1;
    }

    public static void seqCollatz() {
        int val = 0;
        long maxN = 0, value;
        for (int i = 2; i <= 1000000; i++) {
            value = Collatz(i);
            if (value > maxN) {
                maxN = value;
                val = i;
            }
        }
        System.out.println("Sequence = " + maxN + " number = " + val);
    }
}
