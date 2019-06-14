public class Task6 {
       static double radEarth = 6378100.0;
    public static double diff(double v){  //v = how much we added to the circumference
       Circle c1 = new Circle();
       Circle c2 = new Circle();
       c1.setRadius(radEarth);
       double fer = c1.getFerence()+ v;
       c2.setFerence(fer);
       return c2.getRadius()-c1.getRadius();
    }
    public static void main(String[] args){
        double val = Double.parseDouble(args[0]);
        System.out.printf("Delta = %f m.", diff(val));
    }
}
