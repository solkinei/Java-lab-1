public class task4 {
    public static void main(String[] args)
    {
        String in =args[0];
        //String in = "1,2,3,6,7,11,12,13";
        String out="";
        System.out.println(in);
        out = rangeReduction.rangeReduction(in);
        System.out.println(out);
    }
}
