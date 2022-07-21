package lesson27;

public class Runner {
    public static void main(String[] args) {
        BearerSword bearerSword = new BearerSword("Sword");
        System.out.println(bearerSword.getName());
        bearerSword.printEatInfo();
        bearerSword.printSwimInfo();
        bearerSword.printSleepInfo();

        Speakable speakable = new Penguin("Penguin");//обєкт класса Penguin який силається на змінну speakable і прописаний в його адресі
        speakable.printSpeakInfo();

        Animal animal = new Lion("Lion");
        System.out.println(animal.getName());
        animal.printSleepInfo();
        animal.printEatInfo();

        Mammal mammal = new Lion("Lion");
        System.out.println(animal.getName());
        mammal.printSpeakInfo();
        mammal.printRunInfo();
        mammal.printEatInfo();
        mammal.printSleepInfo();


    }
}

