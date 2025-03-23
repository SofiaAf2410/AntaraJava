import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik vasya = new Kotik("Вася",5,5,"meow");
        Kotik senya = new Kotik();
        senya.setKotik("Сеня", 5, 5, "frfrfrf");

        System.out.println(vasya.getInfo());
        vasya.liveAnotherDay();
        System.out.println("==================================");
        System.out.println("Котики "+ vasya.getName() + " и " + senya.getName() + " разговаривают одинаково?: " + (vasya.getMeow() == senya.getMeow()));
        System.out.println(Kotik.getCountOfInstance());
    }
}