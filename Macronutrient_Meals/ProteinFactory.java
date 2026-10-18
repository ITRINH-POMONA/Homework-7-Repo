import java.util.List;

public class ProteinFactory extends FoodFactory{
    private static final ProteinFactory INSTANCE = new ProteinFactory();
     
    private ProteinFactory() {}
     
    public static ProteinFactory getInstance() { return INSTANCE; }
     
    @Override
    protected List<Food> options() {
        return List.of(Food.FISH, Food.CHICKEN, Food.BEEF, Food.TOFU);
    }
    
}
