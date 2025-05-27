package animals;

import food.Food;
import food.Grass;

public abstract class Herbivores extends Animal {

    public Herbivores(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Herbivores(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(getSubspecies() + " ест " + food.getName());
            increaseSatiety(food.getEnergy());
        } else {
            System.out.println(getSubspecies() + " не ест " + food.getName());
        }
    }
}