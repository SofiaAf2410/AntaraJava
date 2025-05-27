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

    public void setAnimal(String area, String body_length, String life_expectancy) {
        this.area = area;
        this.bodyLength = body_length;
        this.lifeExpectancy = life_expectancy;
    }

    public void getInfo() {
        System.out.println("Семейство: " + getName() + "\nПодвид: " + getSubspecies() +
                "\nМесто обитания: " + getArea() + "\nДлина туловища: " + getBody_length() + " см" +
                "\nПродолжительность жизни: " + getLife_expectancy() + " лет" + "\n===============================");
    }

    public abstract void eat(Food food);

    protected void decreaseSatiety(int energy) {
        satiety -= energy;
    }

    protected void increaseSatiety(int energy) {
        satiety += energy;
    }

    public boolean isHungry() {
        return satiety < 10;
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

    public String getBody_length() {
        return bodyLength;
    }

    public String getLife_expectancy() {
        return lifeExpectancy;
    }

    public int getSatiety() {
        return satiety;
    }
}