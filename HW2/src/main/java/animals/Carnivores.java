package animals;
import food.Food;
import food.Meat;

public abstract class Carnivores extends Animal {

    public Carnivores(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Carnivores(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(getSubspecies() + " ест " + food.getName());
            increaseSatiety(food.getEnergy());
        } else {
            System.out.println(getSubspecies() + " не ест " + food.getName());
        }
    }
}