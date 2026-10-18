import java.util.List;

public class FatsFactory extends FoodFactory {
    private static final FatsFactory INSTANCE = new FatsFactory();

    private FatsFactory() {}

    public static FatsFactory getInstance() { return INSTANCE; }
    
    @Override
    protected List<Food> options() {
        return List.of(Food.AVOCADO, Food.SOUR_CREAM, Food.TUNA, Food.PEANUTS);
    }

}
