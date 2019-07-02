public class TaskCircle1 {
    public static void main(String[] args){
        double rad=6378100.0;
        Circle earth = new Circle();
        earth.setRadius(rad);
        earth.setFerence(earth.getFerence()+1);
        double delta = earth.getRadius()-rad ;
        System.out.println("при увеличении длины окружности на 1m " +
                "радиус увеличиться на " + delta + "m");
    }
}

