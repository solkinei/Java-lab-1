package Task6;

public class Main {
    public static void main(String[] args) {
        Circle  earthAndRope = new Circle((double)6378.1);
        double distance = earthAndRope.getRadius();
        earthAndRope.setFerence(earthAndRope.getFerence() + 0.001);
        double differenseDistance = earthAndRope.getRadius() - distance;
        System.out.println(differenseDistance);
        Circle road = new Circle(4);
        double priceOfRoad = road.getArea() * 1000;
        double priceOfFence = road.getFerence() * 2000;
        double priceOfRoadWithFence = priceOfRoad + priceOfFence;
        System.out.println((float)priceOfRoad + " " + (float)priceOfFence + " " + (float)priceOfRoadWithFence);

    }
}
