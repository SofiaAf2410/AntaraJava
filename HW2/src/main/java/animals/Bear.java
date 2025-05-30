package animals;

public class Bear extends Carnivores implements Run, Voice {

    public Bear(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Bear(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public String voice() {
        return getSubspecies() + " рычит: " + "РРРР";
    }

    @Override
    public void run() {
        if (!isHungry()) {
            System.out.println(getSubspecies() + " бегает!");
            decreaseSatiety(40);
        }
    }
}