package lesson25.task2;

public class Pet extends Animal {
    private String name;
    private int tail;
    private int paw;

    public Pet(int eyes, String name, int tail, int paw) {
        super(eyes);
        this.name = name;
        this.tail = tail;
        this.paw = paw;
        System.out.println("I am pet");
        eyes = 2;
    }

    public void printRunInfo() {
        System.out.println("Pet runs");
    }

    public void printJumpInfo() {
        System.out.println("Pet jumps");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }
}
