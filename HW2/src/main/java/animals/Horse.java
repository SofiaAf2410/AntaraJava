package animals;

public class Horse extends Herbivores implements Run, Voice{

    public Horse(String name, String subspecies, int satiety) {
        super(name, subspecies, satiety);
    }

    public Horse(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        super(name, subspecies, area, bodyLength, lifeExpectancy, satiety);
    }

    @Override
    public void run() {
        if (!isHungry()) {
            System.out.println(getSubspecies() + " скачет!");
            decreaseSatiety(40);
        }
    }

    @Override
    public String voice() {
        return getSubspecies() + " ржет: " + "И-го-го";
    }
}