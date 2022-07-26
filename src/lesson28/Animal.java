package lesson28;

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
