package animals;

public class Duck extends Herbivores implements Swim, Voice, Fly {

    public Duck(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Duck(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public void fly() {
        if (!isHungry()) {
            System.out.println(getSubspecies() + " летает!");
            decreaseSatiety(10);
        }
    }

    @Override
    public void swim() {
        if (!isHungry()) {
            System.out.println(getSubspecies() + " плавает!");
            decreaseSatiety(10);
        }
    }

    @Override
    public String voice() {
        return getSubspecies() + " крякает: " + "Кря-кря";
    }
}