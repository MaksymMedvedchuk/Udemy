package lesson25.task2;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        System.out.println("I am cat and my name is: " + getName());
    }

    public void printSleepInfo() {
        System.out.println("Cat sleeps");
    }
}
