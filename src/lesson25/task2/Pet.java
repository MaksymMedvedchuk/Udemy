package lesson25.task2;

public class Pet extends Animal {
    private final int TAILNUMBER = 1; //константа, щоб не могли змінити значення
    private final int PAWNUMBER = 4;
    private String name;

    public Pet(String name) {
        super(2); //визиваю батьківський конструктов і передаю йому в парамент int знаяення 2;
        this.name = name;
        System.out.println("I am pet");
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

    public int getTAILNUMBER() {
        return TAILNUMBER;
    }

    public int getPAWNUMBER() {
        return PAWNUMBER;
    }

}
