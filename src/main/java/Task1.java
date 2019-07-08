public class Task1 {

    public static void main(String[] args) {
        long n = 0;
        long g = 0;
        n = Collatz.numCollatz();
        g = Collatz.lenCollatz(n);

        System.out.println(n);
        System.out.println(g);
    }
}
