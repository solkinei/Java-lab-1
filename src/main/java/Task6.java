public class Task6 {
    static double totalPriceTrack;
    static double totalPriceFence;

    //earth
    public static double earth() {
        double earthRadius = 637810;
        Circle rope = new Circle(earthRadius);
        rope.setFerence(rope.getFerence() + 1);
        double radius1 = rope.getRadius();
        return radius1 - earthRadius;
    }

    // pool
    public static void pool() {
        double priceTrack = 1000;
        double priceFence = 2000;

        Circle pool = new Circle(3);
        double p = pool.getArea();
        pool.setRadius(4);
        double p1 = pool.getArea();
        totalPriceTrack = (p1 - p) * priceTrack;
        totalPriceFence = pool.getFerence() * priceFence;
    }

    public static void main(String[] args) {
        System.out.println("The gap between the Earth and the rope is " + earth());
        pool();
        System.out.println("The track cost is " + totalPriceTrack + " and the fence cost is " + totalPriceFence);
    }
}
