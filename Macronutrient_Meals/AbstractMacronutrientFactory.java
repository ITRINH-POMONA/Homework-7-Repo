public interface AbstractMacronutrientFactory {
    FoodFactory createCarbsFactory();
    FoodFactory createProteinFactory();
    FoodFactory createFatsFactory();
 
    Meal createMeal(DietPlan plan);
}
