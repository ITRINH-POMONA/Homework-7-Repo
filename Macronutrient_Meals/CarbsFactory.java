import java.util.List;

public class CarbsFactory extends FoodFactory{
    private static final CarbsFactory INSTANCE = new CarbsFactory();

    private CarbsFactory() {}

    public static CarbsFactory getInstance() { return INSTANCE; }

    @Override 
    protected List<Food> options() {
        return List.of(Food.CHEESE, Food.BREAD, Food.LENTILS, Food.PISTACHIO);
    }
}
