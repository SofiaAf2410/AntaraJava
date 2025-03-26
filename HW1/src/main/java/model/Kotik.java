package model;

public class Kotik {
    private String name;
    private int prettiness;
    private int weight;
    private String meow;
    private static int countOfInstance = 0;
    private int satiety = 5;

    {
        countOfInstance++;
    }

    public Kotik(String name, int prettiness, int weight, String meow) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
    }

    public Kotik() {
        setKotik("Mars", 10, 4, "meow");
    }

    public static String getCountOfInstance() {
        return "Количество созданных экземпляров класса равно: " + countOfInstance;
    }

    public String getInfo() {
        return "Котик " + getName() + ", вес " + getWeight() + ";" + "\n====================";
    }

    public void setKotik(String name, int prettiness, int weight, String meow) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
    }

    public boolean play() {
        if (satiety >= 4) {
            System.out.println(getName() + " играет!");
            satiety -= 4;
            return true;
        } else {
            return false;
        }
    }

    public boolean sleep() {
        if (satiety >= 2) {
            System.out.println("Сохраняйте тишину! " + getName() + " спит!");
            satiety -= 2;
            return true;
        } else {
            return false;
        }
    }

    public boolean watch() {
        if (satiety >= 1) {
            System.out.println(getName() + " наблюдает за происходящим!");
            satiety -= 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean walk() {
        if (satiety >= 3) {
            System.out.println(getName() + " гуляет!");
            satiety -= 3;
            return true;
        } else {
            return false;
        }
    }

    public boolean wash() {
        if (satiety >= 1) {
            System.out.println(getName() + " умывается!");
            satiety -= 1;
            return true;
        } else {
            return false;
        }
    }

    public void eat(int unit) {
        satiety += unit;
        System.out.println(" " + getName() + " поел! Сытость = " + satiety + " (+ " + unit + " ед).");
    }

    public void eat(int unit, String food) {
        satiety += unit;
        System.out.println(" " + getName() + " съел " + food + "! Сытость = " + satiety + " (+ " + unit + " ед).");
    }

    public void eat() {
        eat(2, "колбаску");
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int randomMethod = (int) (Math.random() * 5) + 1;
            switch (randomMethod) {
                case 1:
                    if (!play()) {
                        System.out.print(getName() + " голоден и хочет есть!");
                        eat(1);
                    }
                    break;
                case 2:
                    if (!sleep()) {
                        System.out.print(getName() + " голоден и хочет есть!");
                        eat();
                    }
                    break;
                case 3:
                    if (!watch()) {
                        System.out.print(getName() + " голоден и хочет есть!");
                        eat(2, "рыбку");
                    }
                    break;
                case 4:
                    if (!walk()) {
                        System.out.print(getName() + " голоден и хочет есть!");
                        eat(1);
                    }
                    break;
                case 5:
                    if (!wash()) {
                        System.out.print(getName() + " голоден и хочет есть!");
                        eat();
                    }
                    break;
                default:
                    System.out.println("Неизвестный метод");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getSatiety() {
        return satiety;
    }
}