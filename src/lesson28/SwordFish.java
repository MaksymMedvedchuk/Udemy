package lesson28;

class SwordFish extends Fish {

    public SwordFish(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("SwordFish is beautiful fish that fast swim");
    }

    @Override
    void eat() {
        System.out.println("SwordFish isn't a predator, and she eats normal food");
    }
}
