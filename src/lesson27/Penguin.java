package lesson27;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Penguins likes to eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleeps pressed against each other");
    }

    @Override
    void fly() {
        System.out.println("Penguins can't fly");
    }

    @Override
    public void speak() {
        super.speak(); //якщо тут закоментувати, то вивидеться трохи інший перелік
        System.out.println("Penguins can't sing like nightingales");
    }
}
