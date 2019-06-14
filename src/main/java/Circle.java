public class Circle {
    private double Radius;
    private double Ference;
    private double Area;


    public void setFerence(double ference) {
        Ference = ference;
        Radius = ference/(2*Math.PI);
        Area = Math.PI*Radius*Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
        Ference = 2*Math.PI*Radius;
        Area = Math.PI*Radius*Radius;
    }

    public void setArea(double area) {
        Area = area;
        Radius = Math.sqrt(Area/Math.PI);
        Ference = 2*Math.PI*Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double getArea() {
        return Area;
    }

    public double getFerence() {
        return Ference;
    }
}
