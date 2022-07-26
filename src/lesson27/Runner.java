package lesson27;

public class Runner {
    public static void main(String[] args) {
        SwordFish swordFish = new SwordFish("Sword");
        System.out.println(swordFish.getName());
        swordFish.eat();
        swordFish.swim();
        swordFish.sleep();

        Speakable speakable = new Penguin("Penguin");//обєкт класса Penguin який силається на змінну speakable і прописаний в його адресі
        speakable.speak();

        Animal animal = new Lion("Lion");
        System.out.println(animal.getName());
        animal.sleep();
        animal.eat();

        Mammal mammal = new Lion("Lion");
        System.out.println(animal.getName());
        mammal.speak();
        mammal.run();
        mammal.eat();
        mammal.sleep();


    }
}

