package lesson27;

class BearerSword extends Fish {

    public BearerSword(String name) {
        super(name);
    }

    @Override
    void printSwimInfo() {System.out.println("Sword is beautiful fish that fast swim");}

    @Override
    void printEatInfo() {System.out.println("Sword isn't a predator, and she eats normal food");
    }
}
