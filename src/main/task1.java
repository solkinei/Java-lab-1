public class task1 {
    static int lenMax = 0;
    static int numMax = 0;
    public static void main(String[] args) {
        int len;
        int num = 2;
        while (num <= 1000000){
            Collatz one = new Collatz();
            len = one.calculation(num);
            if (len > lenMax){
                lenMax = len;
                numMax = num;
            }
            num++;
        }
        System.out.print (numMax + " " + lenMax);
    }
}

class Collatz{
    int calculation (long num){
        int n = 1;
        while (num != 1){
            if (num % 2 == 0)
                num = num / 2;
            else num = 3 * num + 1;
            n++;
        }
        return n;
    }
}