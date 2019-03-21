import java.lang.Math;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Task \"Earth and rope\"");
        double lengthOfRopePiece = 1;
        System.out.print("The distance between earth and rope is ");
        System.out.printf("%.3f meters\n\n", earthAndRope(lengthOfRopePiece));

        System.out.println("Task \"Pool\"");
        double radiusOfPool = 3;
        double widthOfTrack = 1;
        double priceOfSquareMeter = 1000;
        double priceOfRunningMeter = 2000;
        System.out.print("Cost of fence is ");
        System.out.printf("%.2f rubles\n", costOfFence(radiusOfPool, widthOfTrack, priceOfRunningMeter));
        System.out.print("Cost of track coverage is ");
        System.out.printf("%.2f rubles\n", costOfCoverage(radiusOfPool, widthOfTrack, priceOfSquareMeter));
    }

    static double earthAndRope(double lengthOfRopePiece) {
        final double EARTH_RAD_IN_METERS = 63781000.0; //here, final, because earth radius cannot be changed
        Circle earth = new Circle();
        earth.setRadius(EARTH_RAD_IN_METERS);
        Circle rope = new Circle();
        rope.setFerence(earth.getFerence() + lengthOfRopePiece);
        return earth.deltaRadiuses(rope);
    }

    static public double costOfCoverage(double radiusOfPool, double widthOfTrack, double priceOfSquareMeter) {
        Circle pool = new Circle();
        pool.setRadius(radiusOfPool);
        Circle track = new Circle();
        track.setRadius(radiusOfPool + widthOfTrack);
        return costPerArea(pool.deltaAreas(track), priceOfSquareMeter);
    }

    static public double costOfFence(double radiusOfPool, double widthOfTrack, double priceOfRunningMeter) {
        Circle track = new Circle();
        track.setRadius(radiusOfPool + widthOfTrack);
        return track.getFerence() * priceOfRunningMeter;
    }

    static private double costPerArea(double area, double priceOfSquareMeter) {
        return area * priceOfSquareMeter;
    }
}

    class Circle {
        private double radius;
        private double ference;
        private double area;

        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
                this.ference = 2 * Math.PI * radius;
                this.area = Math.PI * radius * radius;
            }
            else
                System.out.println("You entered wrong radius");
        }

        public void setFerence(double ference) {
            if (ference > 0) {
                this.ference = ference;
                this.radius = ference / (2 * Math.PI);
                this.area = Math.PI * this.radius * this.radius;
            }
            else
                System.out.println("You entered wrong ference");
        }

        public void setArea(double area) {
            if (area > 0) {
                this.area = area;
                this.radius = Math.sqrt(area / Math.PI);
                this.ference = Math.PI * this.radius * 2;
            }
            else
                System.out.println("You entered wrong area");
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

        double deltaRadiuses(Circle a) {
            return Math.abs(radius - a.radius);
        }

        double deltaAreas(Circle a) {
            return Math.abs(area - a.area);
        }
    }

