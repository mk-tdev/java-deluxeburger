public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("drink",  1.50, "coke");
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avacado = new Item("Topping", 0.5, "Avacado");
//        avacado.printItem();

//        Burger burger = new Burger( 4.00, "regular");
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "sprite", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        MealOrder deluxMeal = new MealOrder("delux","sprite", "chili");
        deluxMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO", "AVACADO", "NACHOS");
        deluxMeal.setDrinkSize("SMALL");
        deluxMeal.printItemizedList();
    }
}