public class Task2 {
    public static void main(String[] args)
    {
        double val = 16;
        double d = 0.000000001;
        Sqrt sqrt=new Sqrt(val, d);
        double result=sqrt.calc();
        System.out.println("Sqrt of "+val+"="+result);
    }
}

