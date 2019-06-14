public class Collatz {

    static int count = 0;
        static long seqCollatz(){
            long num;
            long maxnumber = 0;
            for (num = 1; num <=1000000; num++)
            {
                collatz(num);
                if (Task1.maxlen < count)
                {
                    Task1.maxlen = count;
                    maxnumber = num;
                }
                count = 0;
            }
            return maxnumber;
        }

        static void collatz (long nm){
            if (nm != 1) {
                count++;
                if (nm % 2 != 0) {
                    nm = nm * 3 + 1;
                }
                else {
                    nm = nm / 2;
                }
                collatz(nm);
            }
            else {
                count++;
            }

        }
}
