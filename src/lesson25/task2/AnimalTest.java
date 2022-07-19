package lesson25.task2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog(2, "Maks", 1, 4);
        System.out.println("Number of paws: " + dog.getPaw());
        Cat cat = new Cat(2, "Cat", 1,4);
        cat.printSleepInfo();
    }
}

