class Circle{
    private double Radius;
    private double Ference;
    private double Area;

    void setRadius(double Radius){
        this.Radius = Radius;
        Ference = 2*3.141592*Radius;
        Area = 3.141592*(Radius*Radius);
    }

    void setFerence(double Ference){
        this.Ference = Ference;
        Radius = Ference/(2*3.141592);
        Area = (Ference*Ference)/(4*3.141592);
    }

    void setArea(double Area){
        this.Area = Area;
        Radius = Math.sqrt(Area/3.141592);
        Ference = 2*Math.sqrt(Area*3.141592);
    }

    double getRadius (){
        return Radius;
    }

    double getFerence (){
        return Ference;
    }

    double getArea (){
        return Area;
    }
}