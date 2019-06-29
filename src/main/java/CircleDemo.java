public class CircleDemo {
    static class Circle {
        private double radius;
        private double ference;
        private double area;

        public Circle(double Value, String str) {
            if(str.charAt(0)=='r' || str.charAt(0)=='R'){
                setRadius(Value);
            }
            else if(str.charAt(0)=='f'|| str.charAt(0)=='F'){
                setFerence(Value);
            }
            else if(str.charAt(0)=='a'|| str.charAt(0)=='A'){
                setArea(Value);
            }
            else
                System.out.println("TypeError!");
        }
         void setRadius(double r){
            this.radius=r;
            this.ference=6.28*r;
            this.area=3.14*r*r;
        }
        void setFerence(double f){
            this.ference=f;
            this.radius=f/6.28;
            this.area=3.14*radius*radius;
        }
        void setArea(double a){
            this.area=a;
            this.radius=Math.sqrt(a/3.14);
            this.ference=6.28*radius;
        }
        double getRadius(Circle c){
            return c.radius;
        }
        double getFerence(Circle c){
            return c.ference;
        }
        double getArea(Circle c){
            return c.area;
        }
    }
    public static void main(String[] args) {
        Circle Earth=new Circle(6378100,"R");
        System.out.println("R = "+ Earth.radius+" F = "+Earth.ference+" A = "+Earth.area);
        Circle EarthPlus=new Circle(Earth.ference+1,"F");
        System.out.println("R = "+ EarthPlus.radius+" F = "+EarthPlus.ference+" A = "+EarthPlus.area);
        System.out.println("result = "+(EarthPlus.radius-Earth.radius)+"m.");
        Circle pool=new Circle(3,"R");
        Circle poolRoat=new Circle(4,"R");
        System.out.println("Стоимость дорожки: "+((poolRoat.area-pool.area)*1000)+"руб.");
        System.out.println("Стоимость ограждения: "+(poolRoat.ference*2000)+"руб.");
        System.out.println("Итого: "+((poolRoat.area-pool.area)*1000+poolRoat.ference*2000)+"руб.");
    }

}