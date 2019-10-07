package oopPart2;


class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelarate() {
        return "Car -> startAccelarate()";
    }

    public String brake() {
        return "Car -> startBrake()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelarate() {
        return "Mitsubishi -> startAccelarate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> startBrake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelarate() {
        return "Ford -> startAccelarate()";
    }

    @Override
    public String brake() {
        return "Ford -> startBrake()";
    }
}

public class Main {

    public static void main(String[] args) {

/*        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelarate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelarate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Focus");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelarate());
        System.out.println(ford.brake());
    }*/

    Meat meat = new Meat("Chicken");
    Meat meat2 = new Meat("Beef");

    Bread bread = new Bread("Muffin");
    Bread bread1 = new Bread("Brown");
    Hamburger hamburger = new Hamburger(bread,meat,true,true);
    HealthyBurger healthyBurger = new HealthyBurger(bread1,meat2,false,false,true,true);
        System.out.println("The price of the burger would be : "+hamburger.getHamburgerPrice()+"$");
        System.out.println(hamburger.baking());

        System.out.println("The price of the burger would be : "+healthyBurger.getHamburgerPrice()+"$");
        System.out.println(healthyBurger.baking());
}
}
