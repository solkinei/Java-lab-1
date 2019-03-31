public class Circle {
    private double radius;
    private double ference; //длина окружности
    private double area; //площадь круга


    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
        this.ference = 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * radius * radius;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = ference / 2 / Math.PI;
        this.area = Math.PI * this.radius * this.radius;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.pow((area / Math.PI), 0.5);
        this.ference = Math.PI * this.radius * 2;
    }

    public double getArea() {
        return area;
    }

    public double getFerence() {
        return ference;
    }

    public double getRadius() {
        return radius;
    }
}

