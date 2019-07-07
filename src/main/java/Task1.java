public class Task1 {
    public static void main(String[] args){
        Collatz objX = new Collatz();
        long numX = 0, maxlen = 0, temp = 0;
        for(long num = 1; num <= 1000000; num++){
            temp = objX.seqCollatz(num);
            if(temp > maxlen){
                maxlen = temp;
                numX = num;
            }
        }
        System.out.println("Наибольшая последовательность Коллатца составляет "+maxlen+" для числа "+numX);
    }
}

class Collatz{
    public static long seqCollatz(long num){
        long len;
        for(len = 1; num != 1; len++){
            if(num %2 == 0)
                num = num/2;
            else num = num*3+1;
        }
        return len;
    }
}