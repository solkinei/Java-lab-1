public class Task1 {
    static long maxNumber;
    static int maxLen;//the result maximum length of Collatz seq.
    static long num;
    static long numWithMaxLen;//the result number with the maximum length of Collatz seq.
    public static void main(String[] args) {
        maxNumber = 1000000;
        maxLen = 0;
        num = 0;
        numWithMaxLen = 0;
        System.out.println("The number with maximum length of Collatz seq. " +
                "for numbers from 1 to " + maxNumber + " is " + seqCollatz(num, maxNumber));
        System.out.println("The length is " + maxLen);
    }


    static long seqCollatz(long num, long maxNumber){
//method, returning number and entering maximum length to maxLen
        int currentLen = 0;
        for (num = 1; num <= maxNumber; num++) {
            currentLen = Collatz.findCollatzLength(num);
            if (currentLen > maxLen) {
                maxLen = currentLen;
                numWithMaxLen = num;
            }
        }
        return numWithMaxLen;
    }
}

class Collatz {

    public static int findCollatzLength(long num){
//method for finding the length of Collatz seq for a number "num"
        if (num == 1)//basic task
            return 1;

        if (num % 2 != 0)
            return findCollatzLength(num * 3 + 1) + 1;

        else
            return findCollatzLength(num / 2) + 1;
    }
}