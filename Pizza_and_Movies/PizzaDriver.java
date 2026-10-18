public class PizzaDriver {
    public static void main(String[] args) {
        System.out.println("Part 1:\n");
        new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.SMALL).pepperoni().mushrooms().extraCheese().build().eat();
        new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.MEDIUM).pepperoni().mushrooms().extraCheese().olives()
            .spinach().beef().build().eat();
        new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.LARGE).pepperoni().mushrooms().extraCheese().olives()
            .spinach().beef().spicyPork().pesto().onions().build().eat();

        System.out.println("Part 2:\n");
        new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.LARGE).pepperoni().mushrooms().extraCheese().build().eat();
        new Pizza.PizzaBuilder("Pizza Hut", Pizza.Size.SMALL).pepperoni().mushrooms().build().eat();

        new Pizza.PizzaBuilder("Little Ceasers", Pizza.Size.MEDIUM).pepperoni().mushrooms().extraCheese().olives()
            .bacon().spinach().onions().spicyPork().build().eat();
        new Pizza.PizzaBuilder("Little Ceasers", Pizza.Size.SMALL).pepperoni().mushrooms().extraCheese().olives()
            .bacon().spinach().build().eat();
        
        new Pizza.PizzaBuilder("Dominos", Pizza.Size.SMALL).pepperoni().build().eat();
        new Pizza.PizzaBuilder("Dominos", Pizza.Size.LARGE).pepperoni().mushrooms().extraCheese().build().eat();
    }
}
