package lesson25.task2;

public class Animal {

    private int eyes;

    public Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("I am animal");
    }

    public void printEatInfo() {
        System.out.println("Animal eats");
    }

    public void printDrinkInfo() {
        System.out.println("Animal drinks");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}


