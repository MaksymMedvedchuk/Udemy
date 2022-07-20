package lesson25.task2;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: " + getName());
    }

    public void printPlayInfo() {
        System.out.println("Dogs play");
    }
}


