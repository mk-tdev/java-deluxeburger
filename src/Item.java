public class Item {
    private String type;
    private double price;
    private String name;
    private String size = "MEDIUM";

    public Item(String type, double price, String name) {
        this.type = type.toUpperCase();
        this.price = price;
        this.name = name.toUpperCase();
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals(("DRINK"))) {
            return size + " " + name;
        }
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getPrice() - 0.5;
            case "LARGE" -> getPrice() + 1;
            default -> getPrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {

        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
