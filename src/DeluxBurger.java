public class DeluxBurger extends Burger {

    Item delux1;
    Item delux2;

    public DeluxBurger(double price, String name) {
        super(price, name);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);

        delux1 = new Item("TOPPING", 0, extra4);
        delux2 = new Item("TOPPING", 0, extra5);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(delux1 != null) {
            delux1.printItem();
        }

        if(delux2 != null) {
            delux2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
