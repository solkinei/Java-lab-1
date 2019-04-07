public class Cycle {

    private double radius;
    private double ference; // длина окружности 2ПR
    private double area; // длина окружности ПR*R
    private double pi = 3.14;

    public Cycle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setFerence(double ference) {
        this.ference = ference;
    }

    public double getArea() {
        if (radius != 0)
            area = radius * radius * pi;
        else
            getRadius();
        area = radius * radius * pi;
        return area;
    }

    public double getFerence() {
        if (radius != 0)
            ference = 2.0 * radius * pi;
        else
            getRadius();
        ference = 2.0 * radius * pi;
        return ference;
    }

    public double getRadius() {
        if (ference != 0)
            radius = ference / (2 * pi);
        else if (area != 0)
            radius = Math.sqrt(area / pi);
        else
            radius = radius;
        return radius;
    }
    public static void main(String[] args) {
        System.out.println("Задача первая ");
        Earth();
        System.out.println("Задача вторая ");
        Pool();
    }

    public static void Earth() {

        Cycle krug = new Cycle();
        double radius = 6378100;
        double stretch = 1.0;
        System.out.println("Радиус земли = " + radius + " м");
        System.out.println("Удлиняем длину верёвки на " + stretch + " м");
        krug.setRadius(6378100);
        double newFerence = krug.getFerence() + stretch;
        krug.setFerence(newFerence);
        double Gap = krug.getRadius() - radius;
        System.out.println("Зазор после удлинения верёвки = " + Gap * 1000 + " мм");
    }

    public static void Pool() {
        double costFence = 2000; // Цена ограды 1м
        double costTrack = 1000; // Цена дорожки 1м^2
        double pool = 3; // Радиус бассейна м
        double track = 1; // Радиус дорожки м
        Cycle Pool = new Cycle();
        Cycle Track = new Cycle();
        Pool.setRadius(pool);
        Track.setRadius(track + pool);
        double squareTrack = Track.getArea() - Pool.getArea();
        System.out.println("Длина забора = " + Track.getFerence() + " м");
        System.out.println("Цена забора = " + Track.getFerence() * costFence + " р");
        System.out.println("Площадь дорожки = " + squareTrack + " м^2");
        System.out.println("Цена дорожки = " + squareTrack * costTrack + " р");
    }
}
