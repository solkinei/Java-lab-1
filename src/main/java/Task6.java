class Circle {
    final double pi = 3.14159;
    double radius;
    double ference;
    double area;

    Circle (){
    }
    void setRadius(double radius) {
        this.radius = radius;
        this.ference = 2 * pi * radius;
        this.area = pi * radius * radius;
    }

    void setFerence(double ference) {
        this.radius = ference / 2 / pi;
        this.ference = ference;
        this.area = pi * this.radius * this.radius;
    }

    void setArea(double area) {
        this.radius = Math.pow((area / pi), 0.5);
        this.ference = this.radius * 2 * pi;
        this.area = area;
    }
}

public class Task6 {
    public static void main(String []args){
        Circle Earth=new Circle();
        Earth.setRadius(6378.1);
        double radius1=Earth.radius;
        Earth.setFerence(Earth.ference+0.001);
        System.out.println("Delta Earth="+(Earth.radius-radius1)*1000+" metres");
        Circle Pool=new Circle();
        Pool.setRadius(3);
        double s1=Pool.area;
        Pool.setRadius(4);
        double cash1=(Pool.area-s1)*1000;
        double cash2=Pool.ference;
        System.out.println("cost of road is "+cash1+" RUB, cost of fence is "+cash2+" RUB");




    }
}
