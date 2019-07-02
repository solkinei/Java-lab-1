class Circle {
    private double Radius;
    private double Ference;
    private double Area;

    private final double Pi = 3.1416;

    public void setRadius(double radius) {
        this.Radius = radius;
        this.Ference = 2*Pi*Radius;
        this.Area = Pi*Radius*Radius;
    }
    public void setFerence(double ference) {
        this.Ference = ference;
        this.Radius = Ference/(2*Pi);
        this.Area = (Ference*Ference)/(4*Pi);
    }
    public void setArea(double area) {
        this.Area = area;
        this.Radius = Math.sqrt(Area/Pi);
        this.Ference = 2*Pi*Radius;
    }
    public double getRadius() {
        return Radius;
    }
    public double getFerence() {
        return Ference;
    }
    public double getArea() {
        return Area;
    }
}

public class Task6 {
    public static void main (String [] args){

        //Earth and rope

        Circle c = new Circle();
        final double offcut = 1.0;
        final double firstRadius = 6378100.0;
        double firstFerence;
        double secondFerence;
        double secondRadius;
        double finalRadius;
        c.setRadius(firstRadius);
        firstFerence = c.getFerence();
        secondFerence = firstFerence + offcut;
        c.setFerence(secondFerence);
        secondRadius = c.getRadius();
        finalRadius = secondRadius - firstRadius;
        System.out.println(finalRadius);

        //Swimming pool

        Circle p = new Circle();
        final double poolRadius = 3.0;
        final double concreteTrack = 1.0;
        final double costOfConcrete = 1000;
        final double costOfFence = 2000;
        double poolArea;
        double poolAndTrackArea;
        double poolAndTrackRadius = poolRadius + concreteTrack;
        double trackArea;
        double coastOfTrack;
        double fence;
        double coastOfPoolFence;
        p.setRadius(poolRadius);
        poolArea = p.getArea();
        p.setRadius(poolAndTrackRadius);
        poolAndTrackArea = p.getArea();
        trackArea = poolAndTrackArea - poolArea;
        coastOfTrack = costOfConcrete  * trackArea;
        fence = p.getFerence();
        coastOfPoolFence = costOfFence * fence;
        System.out.println(coastOfTrack);
        System.out.println(coastOfPoolFence);

    }
}
