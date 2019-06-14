public class task6_2 {
    public static void main(String[] args){

        Circle one = new Circle();
        one.setRadius(3);
        double x = one.getArea();
        one.setRadius(4);
        double y = one.getArea();

        System.out.print("The area of the track is " + (y-x) +" square meters, and it costs ");
        System.out.printf("%.2f", (y-x)*1000);
        System.out.print (" rubles.\nThe fence length is " + one.getFerence() +" meters, and it costs ");
        System.out.printf("%.2f", one.getFerence()*2000);
        System.out.print (" rubles.");
    }
}