package task6;


/*
* Задача 6. Проект CircleDemo

Разработать класс Circle (круг), содержащий следующие поля:

Radius - радиус
Ference - длина окружности
Area - площадь круга
Данные поля рекомендуется объявить как переменные типа double и с модификатором доступа private для безопасности.
Доступ к этим полям следует ограничить с помощью методов класса.

при установке значения радиуса пересчитывать длину окружности и пощадь;
при установке длины окружности пересчитывать радиус и площадь;
при установке площади пересчитывать радиус и длину окружности.
При помощи класса Circle решить две вспомогательные задачи:

"Земля и верёвка"

Решить с использованием класса Circle следующую задачу:

Представим, что земля имеет форму идеального шара.
Вокруг поверхности земного шара туго натянута верёвка (между ней и поверхностью нет никакого зазора).
Кто-то разрезает верёвку в произвольном месте и добавляет кусок верёвки длиной 1 метр.
После вставки между поверхностью земли и верёвкой возникает зазор, вызванный увеличением длины.
Найти величину этого зазора. Примем за радиус земли расстояние в 6378.1 км

"Бассейн"

Решить с помощью класса Circle следующую задачу:

Необходимо рассчитать стоимость материалов для бетонной дорожки вокруг круглого бассейна,
а также стоимость материалов ограды вокруг бассейна (вместе с дорожкой).
Стоимость 1 квадратного метра бетонного покрытия 1000 р.
Стоимость 1 погонного метра ограды 2000 р. Радиус бассейна 3 м. Ширина бетонной дорожки вокруг бассейна 1 м.
 */


public
class Circle {
    private final double pi = 3.14;
    private double Radius; // радиус
    private double Ference; // длина окружности
    private double Area; // площадь круга

    public void setRadius(double radius) {
            this.Radius = radius;
            this.Ference = 2 * pi * radius;
            this.Area = pi * radius * radius;
    }

    public void setFerence(double ference) {
            this.Ference = ference;
            this.Radius = ference / 2 / pi;
            this.Area = pi * this.Radius * this.Radius;
    }

    public void setArea(double area) {
            this.Area = area;
            this.Radius = Math.pow((area / pi), 0.5);
            this.Ference = pi * this.Radius * 2;
    }

    public double getArea() {
        return Area;
    }

    public double getFerence() {
        return Ference;
    }

    public double getRadius() {
        return Radius;
    }
}

class task6{
    double ropeEarth (double radius){
        double r = radius;
        Circle Earth = new Circle();
        Circle Rope = new Circle();
        Earth.setRadius(r);
        double earthFerence = Earth.getFerence();
        double ropeFerence = earthFerence + 0.01;
        Rope.setFerence(ropeFerence);
        return Rope.getRadius() - Earth.getRadius();
    }
     double poolRoad(double poolRadius){
        Circle Pool = new Circle();
        Circle Road = new Circle();
        Pool.setRadius(poolRadius);
        Road.setRadius(poolRadius + 1); // ширина бассейна + 1 м (ширина дорожки)
        double squareRode = Road.getArea() - Pool.getArea();
        double priceRoad = squareRode * 1000; // стоимость дорожки
        return priceRoad;
    }
    double fencingPrice(double poolRadius){
        Circle Fencing = new Circle();
        Fencing.setRadius(poolRadius + 1);
        return Fencing.getFerence() * 2000;
    }

    public static
    void main ( String[] args ) {
        task6 rope = new task6();
        double radius = 6378.1;
        double poolRadius = 3;
        System.out.printf("%.5f mm\n", rope.ropeEarth(radius));
        System.out.printf("Price on raod of pool is %2.2f\n", rope.poolRoad(poolRadius));
        System.out.printf("Price on fencing for pool is %2.2f\n", rope.fencingPrice(poolRadius));
    }
}


