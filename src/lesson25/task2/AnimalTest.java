package lesson25.task2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Maks");
        System.out.println("Number of paws: " + dog.getPawNumber());
        Cat cat = new Cat("Cat");
        cat.printSleepInfo();
    }
}

