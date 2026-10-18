public enum DietPlan {
    NO_RESTRICTION("No Restriction") {
        @Override public boolean allows(Food food) { return true; }
    },

    // No carbs except pistachio, no tofu, no dairy
    PALEO("Paleo") {
        @Override public boolean allows(Food food) {
            if (food.isDairy()) return false;
            return food != Food.BREAD && food != Food.LENTILS && food != Food.TOFU;
        }
    },

    // No meat & no dairy
    VEGAN("Vegan") {
        @Override public boolean allows(Food food) { return !food.isMeat() && !food.isDairy(); }
    },

    // No nuts
    NUT_ALLERGY("Nut Allergy") {
        @Override public boolean allows(Food food) { return !food.isNut(); }
    };
 
    private final String label;
 
    DietPlan(String label) { this.label = label; }
 
    public abstract boolean allows(Food food);
 
    public String toString() { 
        return label; 
    }

}
