public class Task2 {
    public static void main(String[] args)
    {
        double val=Double.parseDouble(args[0]);
        double accuracy = Double.parseDouble(args[1]);
        Sqrt sqrt=new Sqrt(val, accuracy);
        double result=sqrt.calc();
        System.out.println("Sqrt of "+val+"="+result);
    }
}
