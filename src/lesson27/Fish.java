package lesson27;

 abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);//назначення змінно name
    }

    abstract void swim();

    @Override
    public void sleep() { //перезаписав метод з Animal, вся правила виконані по оверайдінгу
        System.out.println("It is always interesting to watch how the fish sleep");
    }
}
