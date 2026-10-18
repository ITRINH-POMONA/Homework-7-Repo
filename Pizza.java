import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public class Pizza {
    // Pizza class has three variables: the name of the pizza chain, an enum of size, and a set of  
    // topping enum instances. Pizza instances can only be made using PizzaBuilder.
    public enum Size {
        SMALL("Small"), MEDIUM("Medium"), LARGE("Large");
        private final String label;

        Size(String label) {
            this.label = label;
        }

        public String toString() { 
            return label; 
        }
    }
    public enum Topping {
        PEPPERONI("Pepperoni"), SAUSAGE("Sausage"), MUSHROOMS("Mushrooms"), BACON("Bacon"),
        ONIONS("Onions"), EXTRA_CHEESE("Extra Cheese"), PEPPERS("Peppers"), CHICKEN("Chicken"),
        OLIVES("Olives"), SPINACH("Spinach"), TOMATO_AND_BASIL("Tomato and Basil"), BEEF("Beef"),
        HAM("Ham"), PESTO("Pesto"), SPICY_PORK("Spicy Pork"), HAM_AND_PINEAPPLE("Ham and Pineapple");
        private final String label;
        
        Topping(String label) {
            this.label = label;
        }

        public String toString() { 
            return label; 
        }
    }

    private final String chain;
    private final Size pizzaSize;
    private final Set<Topping> pizzaToppings;

    private Pizza(PizzaBuilder builder) {
        this.chain = builder.chain;
        this.pizzaSize = builder.pizzaSize;
        this.pizzaToppings = Collections.unmodifiableSet(EnumSet.copyOf(builder.pizzaToppings));
    }

    public void eat() {
            System.out.println("Chain: " + chain);
            System.out.println("Size: " + pizzaSize);
            System.out.println("Toppings: " + (pizzaToppings.isEmpty() ? "Plain cheese" : join()));
            System.out.println();
        }

    private String join() {
        StringBuilder sb = new StringBuilder();
        for (Topping t : pizzaToppings) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(t);
        }
        return sb.toString();
    }

    // Pizza builder ensure that the topping list only has unique toppings
    public static class PizzaBuilder {
        private final String chain;
        private final Size pizzaSize;
        private final Set<Topping> pizzaToppings = EnumSet.noneOf(Topping.class);

        public PizzaBuilder(String chain, Size pizzaSize){
            if (chain == null || pizzaSize == null){
                throw new IllegalArgumentException("Chain and size must be set");
            }
            this.chain = chain;
            this.pizzaSize = pizzaSize;
        }
        
        public PizzaBuilder pepperoni()        { return add(Topping.PEPPERONI); }
        public PizzaBuilder sausage()          { return add(Topping.SAUSAGE); }
        public PizzaBuilder mushrooms()        { return add(Topping.MUSHROOMS); }
        public PizzaBuilder bacon()            { return add(Topping.BACON); }
        public PizzaBuilder onions()           { return add(Topping.ONIONS); }
        public PizzaBuilder extraCheese()      { return add(Topping.EXTRA_CHEESE); }
        public PizzaBuilder peppers()          { return add(Topping.PEPPERS); }
        public PizzaBuilder chicken()          { return add(Topping.CHICKEN); }
        public PizzaBuilder olives()           { return add(Topping.OLIVES); }
        public PizzaBuilder spinach()          { return add(Topping.SPINACH); }
        public PizzaBuilder tomatoAndBasil()   { return add(Topping.TOMATO_AND_BASIL); }
        public PizzaBuilder beef()             { return add(Topping.BEEF); }
        public PizzaBuilder ham()              { return add(Topping.HAM); }
        public PizzaBuilder pesto()            { return add(Topping.PESTO); }
        public PizzaBuilder spicyPork()        { return add(Topping.SPICY_PORK); }
        public PizzaBuilder hamAndPineapple()  { return add(Topping.HAM_AND_PINEAPPLE); }

        private PizzaBuilder add(Topping t) { pizzaToppings.add(t); return this;}

        public Pizza build() {
            if (pizzaSize == null)
                throw new IllegalStateException("Pizza size is required: call small(), medium() or large()");
            return new Pizza(this);
        }
    }
}
