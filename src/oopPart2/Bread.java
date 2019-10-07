package oopPart2;

public class Bread {
    private String name;
    private double price;

    public Bread(String name) {
        this.name = name;
    }
    public double getPrice() {
        if(this.name.equals("Brown"))
            return 0.80;
        else if (this.name.equals("Sliced"))
            return 0.50;
        else if (this.name.equals("Muffin"))
            return 0.90;
        else return 0;
    }
}
