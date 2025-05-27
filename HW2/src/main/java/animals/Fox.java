package animals;

public class Fox extends Carnivores implements Run, Voice {

    public Fox(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Fox(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public void run() {
        if (isHungry()) {
            System.out.println(getSubspecies() + " голодна и хочет есть!");
        } else {
            System.out.println(getSubspecies() + " бегает!");
            decreaseSatiety(30);
        }
    }

    @Override
    public String voice() {
        return getSubspecies() + " гавкает: " +  "Вав-вав";
    }
}