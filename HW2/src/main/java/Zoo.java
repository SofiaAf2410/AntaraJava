import animals.*;
import food.Grass;
import food.Meat;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        Duck kryakva = new Duck("Утка", "Кряква", 30);
        kryakva.setAnimal("Кряква широко распространена в северном полушарии.\nГнездится как в арктических широтах, так и в Северной Африке и на Ближнем Востоке","57-62", "5-10");
        Duck shirokonoska = new Duck("Утка", "Широконоска", 30);
        shirokonoska.setAnimal("Евразия и Северная Америка","44-52", "19");
        Rabbit belyak = new Rabbit("Заяц", "Заяц-беляк", "Тундровая, лесная и частично лесостепная зоны Евразии", "45-60", "7–17", 50);
        Rabbit rusak = new Rabbit("Заяц", "Заяц-русак","Степи, лесостепи, тундра и малооблесённые области \nлесной зоны Европы, Передней и Малой Азии, Северной Африки.", "58-67", "6-7", 50);
        Horse prezivalHorse = new Horse("Лошадь", "Лошадь Пржевальского", "Населяет районы Джунгарии, в Монголии.", "220-280", "до 25",80);
        Horse kulan = new Horse("Лошадь", "Кулан", "Равнинные и низкогорные сухие степи, полупустыни и пустыни Передней, \nСредней и Центральной Азии", "до 200", "20",80);

        Fish zmeegolov = new Fish("Рыбы", "Змееголов", 20);
        zmeegolov.setAnimal("Реки Дальнего Востока от Янцзы на юге до бассейна реки Амур на севере,\n включая Приморский край в России.", "12-15","до 20");
        Fish greenAprion = new Fish("Рыбы", "Зелёный априон", 20);
        greenAprion.setAnimal("Теплые тропические воды Юго-Восточной Азии, \nего можно встретить вблизи берегов Австралии, Восточной Африки, островов Океании", "20-100","до 112");
        Bear grizzly  = new Bear("Медведь", "Гризли", "Преимущественно гризли распространены на Аляске \n(включая прилегающие острова) и в западных районах Канады.", "200-250", "20-25", 100);
        Bear whiteBear  = new Bear("Медведь", "Белый медведь", "Арктика, приполярные области в Северном полушарии Земли", "250–300", "20-30", 100);
        Fox fenek = new Fox("Лиса", "Фенек", "Пустыни Северной Африки", "30-40","7-8", 60);
        Fox pesets = new Fox("Лиса", "Песец", "Распространён за Северным полярным кругом, на побережье \nи островах Северного Ледовитого океана, в тундровой и лесотундровой зонах.", "50-75","7-8", 60);

        Grass vodorosl = new Grass("водоросль", 10);
        Grass seno = new Grass("сено", 20);
        Grass carrot = new Grass("морковь", 30);
        Grass apple = new Grass("яблоко", 30);
        Grass zerno = new Grass("зерно", 30);

        Meat fish = new Meat("рыба", 20);
        Meat ptitsa = new Meat("птица", 30);
        Meat gryzun = new Meat("грызун", 40);
        Meat nasekomoe = new Meat("насекомое", 30);

        Worker worker = new Worker("John");

        worker.feed(kryakva, vodorosl);
        worker.feed(shirokonoska, fish);
        worker.feed(fenek, seno);
        worker.feed(pesets, gryzun);
        worker.feed(belyak, ptitsa);
        worker.feed(rusak, carrot);
        worker.feed(greenAprion, fish);
        worker.feed(rusak, zerno);
        worker.feed(prezivalHorse, ptitsa);
        worker.feed(prezivalHorse, apple);
        worker.feed(kulan, nasekomoe);
        worker.feed(kulan, carrot);
        worker.feed(grizzly, vodorosl);
        worker.feed(whiteBear, fish);

        worker.getVoice(kryakva);
        worker.getVoice(grizzly);
        worker.getVoice(fenek);
        worker.getVoice(belyak);
        worker.getVoice(prezivalHorse);

        worker.clean(grizzly);

        List<Swim> pond = new ArrayList<>(List.of(kryakva, shirokonoska, zmeegolov, greenAprion));

        for (Swim waterfowl : pond) {
            waterfowl.swim();
        }

        List<Animal> zooAnimals = new ArrayList<>(List.of(kryakva, shirokonoska, fenek, pesets,whiteBear,grizzly,
                belyak, rusak, kulan, prezivalHorse, zmeegolov, greenAprion));

        for (Animal a : zooAnimals) {
            a.getInfo();
        }
    }
}