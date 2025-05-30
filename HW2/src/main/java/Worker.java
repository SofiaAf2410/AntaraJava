import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {

    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {
       animal.eat(food);
    }
    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
    public void clean(Animal animal) {
        System.out.println("У " + animal.getSubspecies() + " убрано");
    }

    public String getName() {
        return name;
    }
}