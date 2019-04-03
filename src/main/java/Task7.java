public class Task7 {
    static double fenceCost = 2000.0;
    static double concreteCost = 1000.0;
    public static double totalCost(double rad){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.setRadius(rad);
        c2.setRadius(rad+1.0);
        double cost = ((c2.getArea()-c1.getArea())*concreteCost)+(c2.getFerence()*fenceCost);
        return cost;
    }
    public static void main(String[] args){
        double poolrad = Double.parseDouble(args[0]);
        System.out.printf("Total cost = %.2f ru.", totalCost(poolrad));
    }
}
