class Circle {

    private double radius;
    private double ference;
    private double area;

    void setRadius(double r) {
        radius = r;
        ference = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
    }

    void setFerence(double f) {
        ference = f;
        radius = ference / (2 * Math.PI);
        area = Math.PI * radius * radius;
    }

    void setArea(double a) {
        area = a;
        radius = Math.sqrt(area / Math.PI);
        ference = 2 * Math.PI * radius;
    }

    double getRadius() {
        return radius;
    }

    double getFerence() {
        return ference;
    }

    double getArea() {
        return area;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Circle earth = new Circle();
        earth.setRadius(6378.1 * 1000);
        earth.setFerence(earth.getFerence() + 1);
        System.out.printf("Gap size = %.2f meters\n",(earth.getRadius() - 6378.1 * 1000));

        Circle pool=new Circle();
        pool.setRadius(3);
        Circle poolPath=new Circle();
        poolPath.setRadius(3+1);
        double pathPrice=(poolPath.getArea()-pool.getArea())*1000;
        System.out.printf("The cost of path is equals to %.2f\n",pathPrice);
        double fencePrice=poolPath.getFerence()*2000;
        System.out.printf("The cost of fence is equals to %.2f\n",fencePrice);
        System.out.printf("Total cost is equals to %.2f\n", pathPrice+fencePrice);
    }
}
