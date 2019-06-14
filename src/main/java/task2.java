public class task2 {
    public static void main(String[] args)
    {
        double val=0.5;
        Sqrt sqrt=new Sqrt(val);//default precision
        System.out.println("Sqrt of "+val+"="+sqrt.calc());

        sqrt.delta=0.01;// precision 0.01
        System.out.println("Sqrt of "+val+"="+sqrt.calc());
    }
}
