public enum Food {
    // Carbs

    CHEESE("Cheese", false, true, false),
    BREAD("Bread", false, false, false),
    LENTILS("Lentils", false, false, false),
    PISTACHIO("Pistachio", false, false, true),

    // Protein

    FISH("Fish", true, false, false),
    CHICKEN("Chicken", true, false, false),
    BEEF("Beef", true, false, false),
    TOFU("Tofu", false, false, false),

    // Fats

    AVOCADO("Avocado", false, false, false),
    SOUR_CREAM("Sour cream", false, true, false),
    TUNA("Tuna", true, false, false),
    PEANUTS("Peanuts", false, false, true);

    private final String label;
    private final boolean meat;
    private final boolean dairy;
    private final boolean nut;

     Food(String label, boolean meat, boolean dairy, boolean nut) {
        this.label = label;
        this.meat = meat;
        this.dairy = dairy;
        this.nut = nut;
    }

    public boolean isMeat()  { return meat; }
    public boolean isDairy() { return dairy; }
    public boolean isNut()   { return nut; }

    public String toString() { 
        return label; 
    }
}
