package lesson28;

public class Runner {
    public static void main(String[] args) {
        Animal firstAnimal = new SwordFish("Firs SwordFish");//чому SwordFish, а не Fish?
        Animal secondAnimal = new Penguin("Firs Penguin");
        Animal thirdAnimal = new Lion("Firs Lion");
        Fish firstFish = new SwordFish("Second SwordFish");
        Bird firstBird = new Penguin("Second Penguin");
        Mammal firstMammal = new Lion("Second Lion");
        SwordFish firstSwordFish = new SwordFish("Third SwordFish");
        Penguin firstPenguin = new Penguin("Third Penguin");
        Lion firstLion = new Lion("Third Lion");
        Speakable firstSpeakable = new Penguin("Fourth Penguin");
        Speakable secondSpeakable = new Lion("Fourth Lion");
        Animal[] firstArray = {firstAnimal, secondAnimal, thirdAnimal, firstFish, firstBird, firstMammal, firstPenguin,
                firstLion};
        Speakable[] secondArray = {firstSpeakable, secondSpeakable, firstMammal, firstPenguin, firstLion};

        for (Animal a : firstArray) {
            if (a instanceof SwordFish) {  //чи являється змінна а обєктом класа SwordFish, якщо так, тоді створюється
                // обєкт SwordFish і силається на а(Animal)
                SwordFish swordFish = (SwordFish) a; // заставляємо повірити компілору, що зміна а силається на SwordFish
                System.out.println(swordFish.getName());
                swordFish.eat();
                swordFish.sleep();
                swordFish.eat();
            } else if (a instanceof Penguin) {
                Penguin penguin = (Penguin) a;
                System.out.println(penguin.getName());
                penguin.eat();
                penguin.speak();
                penguin.sleep();
                penguin.fly();
            } else if (a instanceof Lion) {
                Lion lion = (Lion) a;
                System.out.println(lion.getName());
                lion.run();
                lion.eat();
                lion.sleep();
                lion.speak();
            }
            System.out.println("---------------------------------------------------------------");
        }
        for (Speakable s : secondArray) {
            if (s instanceof Penguin) {
                Penguin penguin2 = (Penguin) s;
                System.out.println(penguin2.getName());
                penguin2.fly();
                penguin2.speak();
                penguin2.sleep();
                penguin2.eat();
            } else if (s instanceof Lion) {
                Lion lion2 = (Lion) s;
                System.out.println(lion2.getName());
                lion2.speak();
                lion2.run();
                lion2.sleep();
                lion2.eat();
            }
            System.out.println("---------------------------------------------------------------");
        }
    }
}

