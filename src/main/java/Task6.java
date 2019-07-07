public class Task6 {
    static double totalPriceTrack;
    static double totalPriceFence;

    //earth
    public static double earth() {
        double earthRadius = 637810;
        Circle rope = new Circle(earthRadius);
        rope.setLenght(rope.getLenght() + 1);
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
        totalPriceFence = pool.getLenght() * priceFence;
    }

    public static void main(String[] args) {
        System.out.println("lenght between Earth and rope - " + earth());
        pool();
        System.out.println("Total track cost - " + totalPriceTrack + " and totalFenceCost" + totalPriceFence);
    }
}