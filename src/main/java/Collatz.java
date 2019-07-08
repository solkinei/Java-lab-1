public class Collatz {

    public static long lenCollatz(long n) {
        long length = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                length++;
            }
            else {
                n = n * 3 + 1;
                length++;
            }
        }
        length++;
        return length;
    }

    public static long numCollatz() {
        long maxLength = 0;
        long number = 0;
        long len;
        for (int i = 1; i <= 1000000; i++) {
            len = lenCollatz(i);
            if (len > maxLength) {
                maxLength = len;
                number = i;
            }
        }
        return number;
    }
}
