package animals;

public class Rabbit extends Herbivores implements Run, Voice{

    public Rabbit(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Rabbit(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public void run() {
        if (!isHungry()) {
            System.out.println(getSubspecies() + " бегает!");
            decreaseSatiety(20);
        }
    }

    @Override
    public String voice() {
        return getSubspecies() + " хрумкает: " + "Хрум-хрум";
    }
}