public class Task1 {

    static long maxlen = 0;
        public static void main (String [] args){
            long number;
            number = Collatz.seqCollatz();
            System.out.println("maxlen= "+ maxlen+" namber="+number);
        }

}
