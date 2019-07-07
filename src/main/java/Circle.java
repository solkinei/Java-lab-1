public class Circle {
    private double area;
    private double radius;
    private double lenght;


    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
        this.lenght = 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.lenght = 2 * Math.PI * radius;
        this.area = Math.PI * radius * radius;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
        this.radius = lenght / 2 / Math.PI;
        this.area = Math.PI * this.radius * this.radius;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.pow((area / Math.PI), 0.5);
        this.lenght = Math.PI * this.radius * 2;
    }

    public double getArea() {
        return area;
    }

    public double getLenght() {
        return lenght;
    }

    public double getRadius() {
        return radius;
    }
}
