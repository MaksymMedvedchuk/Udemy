package lesson28;

class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lion as like anybody predator like meat");
    }

    @Override
    void sleep() {
        System.out.println("Bigger part of the day lion sleeps");
    }

    @Override
    void run() {
        System.out.println("Lion isn't the most faster cat");
    }
}
