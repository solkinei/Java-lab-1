
public class Task1 {
    public static long collatz(long n) {
        if (n == 1)
            return 1;
        else if (n % 2 == 0)
            return 1 + collatz(n / 2);
        else return 1 + collatz(3 * n + 1);
    }

    public static void main(String[] args) {
        //int N=Integer.parseInt(args[0]);
        long maxLen = 1, cur;
        long number = 1;
        for (long i = 1; i <= 1000000; i++) {
            cur = collatz(i);
            if (cur>maxLen){
                maxLen=cur;
                number=i;
            }
        }
        System.out.println("number: "+number+" lenght: "+maxLen);
    }
}
