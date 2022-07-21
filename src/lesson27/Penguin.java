package lesson27;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    void printEatInfo() {
        System.out.println("Penguins likes to eat fish");
    }

    @Override
    void printSleepInfo() {
        System.out.println("Penguins sleeps pressed against each other");
    }

    @Override
    void printFlyInfo() {
        System.out.println("Penguins can't fly");
    }

    @Override
    public void printSpeakInfo() {
        super.printSpeakInfo(); //якщо тут закоментувати, то вивидеться трохи інший перелік
        System.out.println("Penguins can't sing like nightingales");
    }
}
