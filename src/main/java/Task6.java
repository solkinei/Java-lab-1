public class Task6 {
    public static void main(String[] args){
        Circle Earth = new Circle();
        Earth.setRadius(6378.1);
        Circle EarthAndRope = new Circle();
        EarthAndRope.setFerence(Earth.getFerence() + 0.001);
        System.out.println("Зазор между поверхностью Земли и верёвкой составляет: " + (EarthAndRope.getRadius() - Earth.getRadius()) +" м");

        Circle pool = new Circle();
        pool.setRadius(3);
        Circle road = new Circle();
        road.setRadius(pool.getRadius() + 1);
        double roadPrice = (road.getArea() - pool.getArea()) * 1000;
        double wallPrise = road.getFerence() * 2000;
        double sum = roadPrice + wallPrise;
        System.out.println("Стоимость материалов для дорожки и забора составляет: " + sum + " дензнаков");
    }
}

class Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.ference = 2 * Math.PI * radius;
        this.area = Math.PI * radius * radius;
    }

    private double ference;

    public double getFerence() {
        return ference;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.area = Math.PI * this.radius * this.radius;
        this.radius = ference / (2 * Math.PI);
    }

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(area / Math.PI);
        this.ference = 2 * Math.PI * this.radius;
    }
}