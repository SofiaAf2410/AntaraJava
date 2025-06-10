package animals;

import food.Food;

public abstract class Animal {
    private final String name;
    private final String subspecies;
    private String area;
    private String bodyLength;
    private String lifeExpectancy;
    private int satiety;

    public Animal(String name, String subspecies, int satiety) {
        this.name = name;
        this.subspecies = subspecies;
        this.satiety = satiety;
    }

    public Animal(String name, String subspecies, String area, String bodyLength, String lifeExpectancy, int satiety) {
        this.name = name;
        this.subspecies = subspecies;
        this.area = area;
        this.bodyLength = bodyLength;
        this.lifeExpectancy = lifeExpectancy;
        this.satiety = satiety;
    }

    public void setAnimal(String area, String bodyLength, String lifeExpectancy) {
        this.area = area;
        this.bodyLength = bodyLength;
        this.lifeExpectancy = lifeExpectancy;
    }

    public void getInfo() {
        System.out.println("Семейство: " + getName() + "\nПодвид: " + getSubspecies() +
                "\nМесто обитания: " + getArea() + "\nДлина туловища: " + getBodyLength() + " см" +
                "\nПродолжительность жизни: " + getLifeExpectancy() + " лет" + "\n===============================");
    }

    public abstract void eat(Food food);

    protected void decreaseSatiety(int energy) {
        satiety -= energy;
    }

    protected void increaseSatiety(int energy) {
        satiety += energy;
    }

    public boolean isHungry() {
        if (satiety < 10) {
            System.out.println(getSubspecies() + " голоден и хочет есть!");
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public String getArea() {
        return area;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    public String getLifeExpectancy() {
        return lifeExpectancy;
    }

    public int getSatiety() {
        return satiety;
    }
}