package oopPart2;

public class Meat {
    private String name;
    private double price;

    public Meat(String name) {
        this.name = name;
        if(name.equals("Chicken"))
            this.price=4.50;
            else if (name.equals("Beef"))
                this.price=5.50;
            else this.price=0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
