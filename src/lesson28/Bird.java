package lesson28;

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        Speakable.super.speak();
        System.out.println(getName() + " sings");
    }

    abstract void fly();
}
