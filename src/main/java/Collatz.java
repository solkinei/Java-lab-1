class Collatz {
    public static long collatz(long n) {
        //  System.out.println(n+" ");
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return 1 + collatz(n / 2);
        } else {
            return 1 + collatz(3 * n + 1);
        }
    }

    public static void CollatzDemo() {
        long len = 0;
        for (long num = 1; num <= 1000000; num++) {
            len = collatz(num);
            if (len > Task1.maxlen) {
                Task1.maxlen = len;
                Task1.maxNum = num;
            }
        }
    }
}

