package model;

public class Kotik {
    private String name;
    private int prettiness;
    private int weight;
    private String meow;
    private static int countOfInstance = 0;
    private static int satiety = 5;

    public Kotik(String name, int prettiness, int weight, String meow) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
        countOfInstance++;
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
            satiety -= 4;
            return true;
        } else {
            return false;
        }
    }

    public boolean sleep() {
        if (satiety >= 2) {
            satiety -= 2;
            return true;
        } else {
            return false;
        }
    }

    public boolean watch() {
        if (satiety >= 1) {
            satiety -= 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean walk() {
        if (satiety >= 3) {
            satiety -= 3;
            return true;
        } else {
            return false;
        }
    }

    public boolean wash() {
        if (satiety >= 1) {
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
                    if (play()) {
                        System.out.println(getName() + " играет!");
                    } else {
                        System.out.print(getName() + " откзывается играть, просит его покормить!");
                        eat(1);
                    }
                    break;
                case 2:
                    if (sleep()) {
                        System.out.println("Сохраняйте тишину! " + getName() + " спит!");
                    } else {
                        System.out.print(getName() + " не ляжет спать голодным!");
                        eat();
                    }
                    break;
                case 3:
                    if (watch()) {
                        System.out.println(getName() + " наблюдает за происходящим!");
                    } else {
                        System.out.print(getName() + " отказывается смотреть в окно, пока не поест!");
                        eat(2, "рыбку");
                    }
                    break;
                case 4:
                    if (walk()) {
                        System.out.println(getName() + " гуляет!");
                    } else {
                        System.out.print(getName() + " устал, просит его покормить!");
                        eat(1);
                    }
                    break;
                case 5:
                    if (wash()) {
                        System.out.println(getName() + " умывается!");
                    } else {
                        System.out.print(getName() + " просит его покормить!");
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

    public static int getSatiety() {
        return satiety;
    }

    public Kotik() {
        setKotik("Mars", 10, 4, "meow");
        countOfInstance++;
    }
}