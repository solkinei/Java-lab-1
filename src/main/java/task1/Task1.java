package tak1;

public class Task1 {
    public static
    long collatz ( long n ) {
        if (n == 1)
            return 1;
        else if (n % 2 == 0)
            return 1 + collatz(n / 2);
        else return 1 + collatz(3 * n + 1);
    }
}
