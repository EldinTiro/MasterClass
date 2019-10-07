package oopPart2;

public class Hamburger {
    private Bread breadRollType;
    private Meat meat;
    private boolean mayonnaise;
    private boolean ketchup;

    public Hamburger(Bread breadRollType, Meat meat, boolean mayonnaise, boolean ketchup) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        this.ketchup = ketchup;
    }
    public double getHamburgerPrice()
    {
        double hamburgerPrice = meat.getPrice()+breadRollType.getPrice();
        if(mayonnaise)
            hamburgerPrice+=0.50;
        if(ketchup)
            hamburgerPrice+=0;
        return hamburgerPrice;
    }

    public String baking ()
    {
        return getClass().getSimpleName()+" is baking ----->>>>";
    }
}
