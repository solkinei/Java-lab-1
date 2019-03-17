public class Task1 {
    static long maxNumber;
    public static void main(String[] args) {
        maxNumber = 1000000;
        Collatz num = new Collatz(maxNumber);
        num.seqCollatz(num);
        //num.setNumber(num.seqCollatz(num));
        System.out.println("The number with maximum length of Collatz seq. " +
                "for numbers from 1 to " + num.getMaxNumber() + " is " + num.getNumber());
        System.out.println("The length is " + num.getLength());
    }
}

class Collatz {
    private int length;
    private long number;
    private long maxNumber;

    public Collatz(long maxNumber){
//constructor for the class Collatz
        this.length = 0;
        this.number = 0;
        this.maxNumber = maxNumber;
    }

//getters and setters
    public void setLength(int length) {
        this.length = length;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setMaxNumber(long maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getLength() {
        return length;
    }

    public long getNumber() {
        return number;
    }

    public long getMaxNumber() {
        return maxNumber;
    }

    private int findCollatzLength(long num){
//method for finding the length of Collatz seq for a number "num"
        if (num == 1)//basic task
            return 1;

        if (num % 2 != 0)
            return findCollatzLength(num * 3 + 1) + 1;

        else
            return findCollatzLength(num / 2) + 1;
    }

    public void seqCollatz(Collatz a){
//method, returning number and entering maximum length to maxlen
        int currentLen = 0;
        for (long num = 2; num <= a.getMaxNumber(); num++) {
            currentLen = findCollatzLength(num);
            if (currentLen > a.getLength()) {
			    a.setLength(currentLen);
			    a.setNumber(num);
            }
        }
    }
}