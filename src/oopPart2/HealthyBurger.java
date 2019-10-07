package oopPart2;

public class HealthyBurger extends Hamburger {
    private boolean greenSalat;
    private boolean beans;

    public HealthyBurger(Bread breadRollType, Meat meat, boolean mayonnaise, boolean ketchup, boolean greenSalat, boolean beans) {
        super(breadRollType, meat, mayonnaise, ketchup);
        this.greenSalat = greenSalat;
        this.beans = beans;
    }

    @Override
    public double getHamburgerPrice() {
        double price = super.getHamburgerPrice();
        if(greenSalat)
            price+=0.50;
        if(beans)
            price+=1;
        return price;
    }

    @Override
    public String baking() {
        return getClass().getSimpleName()+" is baking ----->>>>";
    }
}
