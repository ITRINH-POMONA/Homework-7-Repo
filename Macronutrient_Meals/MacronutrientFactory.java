public final class MacronutrientFactory implements AbstractMacronutrientFactory {
    private static final MacronutrientFactory INSTANCE = new MacronutrientFactory();
 
    private MacronutrientFactory() { }
 
    public static MacronutrientFactory getInstance() { return INSTANCE; }
 
    @Override public FoodFactory createCarbsFactory() { return CarbsFactory.getInstance(); }
    @Override public FoodFactory createProteinFactory() { return ProteinFactory.getInstance(); }
    @Override public FoodFactory createFatsFactory() { return FatsFactory.getInstance(); }
 
    @Override
    public Meal createMeal(DietPlan plan) {
        Food carbs = createCarbsFactory().createFood(plan);
        Food protein = createProteinFactory().createFood(plan);
        Food fats = createFatsFactory().createFood(plan);
        return new Meal(carbs, protein, fats);
    }

}
