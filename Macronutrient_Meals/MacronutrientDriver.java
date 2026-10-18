public class MacronutrientDriver {
    public static void main(String[] args) {
        AbstractMacronutrientFactory factory = MacronutrientFactory.getInstance();

        Customer[] customers = {
            new Customer("Jeff", DietPlan.NO_RESTRICTION),
            new Customer("Jiff", DietPlan.PALEO),
            new Customer("Geoff", DietPlan.VEGAN),
            new Customer("Jeffery", DietPlan.NUT_ALLERGY),
            new Customer("Geoffrey", DietPlan.VEGAN),
            new Customer("G", DietPlan.PALEO)
        };
        
        for (Customer customer : customers) {
            Meal meal = factory.createMeal(customer.getDietPlan());
            System.out.println("Customer: " + customer.getName() + " (" + customer.getDietPlan() + ")");
            System.out.println("  " + meal);
            System.out.println();
        }

    }
}
