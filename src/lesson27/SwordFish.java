package lesson27;

class SwordFish extends Fish {

    public SwordFish(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Sword is beautiful fish that fast swim");
    }

    @Override
    void eat() {
        System.out.println("Sword isn't a predator, and she eats normal food");
    }
}
