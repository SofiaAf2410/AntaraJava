package food;

public abstract class Food {
    private final String name;
    private final int energy;

    public Food(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }
}