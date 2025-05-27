package animals;

public class Fish extends Carnivores implements Swim{

    public Fish(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Fish(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public void swim() {
        if (isHungry()) {
            System.out.println(getSubspecies() + " голодна и хочет есть!");
        } else {
            System.out.println(getSubspecies() + " плавает!");
            decreaseSatiety(10);
        }
    }
}