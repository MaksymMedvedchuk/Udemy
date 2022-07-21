package lesson27;

abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }

    abstract void printRunInfo();
}

