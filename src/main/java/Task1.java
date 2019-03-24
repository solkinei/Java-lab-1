public class Task1 {
    static long maxNumber=0;
    static long maxLenght=0;
    static long currentLenght;

    public static void collatz(long n) {
 //       System.out.print(n + " ");
        if (n == 1){
            currentLenght++;
            return;
        }
        else if (n % 2 == 0) {
            currentLenght++;
            collatz(n / 2);
        }
        else {
            currentLenght++;
            collatz(3*n + 1);
        }
    }

    public static void main(String[] args) {
        for(long N=1;N<=1000000;N++){
 //           System.out.print("\nN = "+N+"\n");
            currentLenght=0;
            collatz(N);
            if(currentLenght>maxLenght)
            {
                maxLenght=currentLenght;
                maxNumber=N;
            }
        }
        System.out.print("/nMax lenght = "+maxLenght+"; Max number = "+maxNumber);

        System.out.println();
    }
}
