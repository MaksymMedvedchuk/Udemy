package lesson28;

abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    abstract void swim();

    @Override
    public void sleep() {
        System.out.println("It is always interesting to watch how the fish sleep");
    }
}
