package Task6;

public class Circle {
    private double radius;
    private  double ference;
    private double area;

    public Circle(double radius){
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * Math.pow(radius,2);
    }

    public double getFerence() {
        return ference;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = ference / 2 / Math.PI;
        this.area = Math.PI * Math.pow(radius,2);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(area / Math.PI);
        this.ference = 2 * Math.PI * radius;
    }

}