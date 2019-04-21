 class Collatz {
    static  long nextNum(long a){
       return a%2==0 ?  a/2 : 3*a+1;
    }

    static int lengthCollatz(long a){
        int length =1;
        while ( a != 1){
            length++;
            a = nextNum(a);
        }
        return length;
    }
    static int maxLengthCollatz(){
        int maxLength = 0;
        for (int i=1; i<=1000000; i++) {
        if (lengthCollatz(i) > maxLength)
            maxLength = lengthCollatz(i);
        }
        return  maxLength;
    }
}
