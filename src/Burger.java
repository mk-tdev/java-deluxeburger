public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(double price, String name) {
        super("Burger", price, name);
    }

    @Override
    public double getAdjustedPrice() {
        return getPrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVACADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "LETTUCE" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("TOPPING",  getExtraPrice(extra1), extra1);
        this.extra2 = new Item("TOPPING",  getExtraPrice(extra2), extra2);
        this.extra3 = new Item("TOPPING",  getExtraPrice(extra3), extra3);
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getPrice());
        if(extra1 != null) {
            extra1.printItem();
        }
        if(extra2 != null) {
            extra2.printItem();
        }
        if(extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
