import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class FoodFactory {
    protected abstract List<Food> options();

    public Food createFood(DietPlan plan) {
        List<Food> allowed = new ArrayList<>();
        for (Food food : options()) {
            if (plan.allows(food)) allowed.add(food);
        }
        if (allowed.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + " has no food allowed by " + plan);
        }
        return allowed.get(ThreadLocalRandom.current().nextInt(allowed.size()));
    }

}
