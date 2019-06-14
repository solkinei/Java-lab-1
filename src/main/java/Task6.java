

public class Task6 {
    public static void main (String[] args){
    //Earth and rope:
        double planetEarthRadius=6378100;
        Circle earth=new Circle(planetEarthRadius);

        earth.setFerence(earth.getFerence()+1);                    // calculate all for longer rope
        double result=earth.getRadius()-planetEarthRadius;

        System.out.println("Earth and rope result = "+result+" meters");

    //Swimming pool
        double concretePrice=1000;
        double fencePrice=2000;
        double poolRadius=3;

        Circle pool=new Circle(poolRadius);                        // pool
        Circle concreteRoad=new Circle(poolRadius+1);       // pool+road
        double concreteTotalPrice= (concreteRoad.getArea()-pool.getArea())*concretePrice;
        double fenceTotalPrice=concreteRoad.getFerence()*fencePrice;
        System.out.println("Concrete road price = "+concreteTotalPrice+"\nFence price = "+fenceTotalPrice);
    }
}

class Circle {
    private double radius;
    private double ference;
    private double area;

    public Circle(double radius){
        this.radius=radius;
        this.area=Math.PI*Math.pow(radius,2);
        this.ference=2*Math.PI*radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
        this.area=Math.PI*Math.pow(radius,2);
        this.ference=2*Math.PI*radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setFerence (double ference){
        this.ference=ference;
        this.radius=ference/(2*Math.PI);
        this.area=Math.PI*Math.pow(radius,2);
    }

    public double getFerence (){
        return ference;
    }

    public void setArea(double area){
        this.area=area;
        this.radius=Math.sqrt(area/Math.PI);
    }

    public double getArea(){
        return area;
    }
}
