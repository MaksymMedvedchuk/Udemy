package lesson27;

 abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);//назначення змінно name
    }

    abstract void printSwimInfo();

    @Override
    public void printSleepInfo() { //перезаписав метод з Animal, вся правила виконані по оверайдінгу
        System.out.println("It is always interesting to watch how the fish sleep");
    }
}
