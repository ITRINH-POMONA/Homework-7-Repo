public class Meal {
    private final Food carbs;
    private final Food protein;
    private final Food fats;
 
    public Meal(Food carbs, Food protein, Food fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }
 
    public Food getCarbs()   { return carbs; }
    public Food getProtein() { return protein; }
    public Food getFats()    { return fats; }
    
    public String toString() {
        return "Carbs: " + carbs + " | Protein: " + protein + " | Fats: " + fats;
    }

}
