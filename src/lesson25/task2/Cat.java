package lesson25.task2;

public class Cat extends Pet {
    public Cat(int eyes, String name, int tail, int paw) {
        super(eyes, name, tail, paw);
        System.out.println("I am cat ant my name is: " + getName());
    }

    public void printSleepInfo() {
        System.out.println("Cats sleeps");
    }
}
