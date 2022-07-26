package lesson27;

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        Speakable.super.speak();//визиваємо супер метод класа Speakable, якщо його закоментувати він не нащо
        // не впливає. Чого таі і навіщо він тоді?
        System.out.println(getName() + " sing");
    }

    abstract void fly();
}
