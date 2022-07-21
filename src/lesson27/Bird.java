package lesson27;

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void printSpeakInfo() {
        Speakable.super.printSpeakInfo();//визиваємо супер метод класа Speakable, якщо його закоментувати він не нащо
        // не впливає. Чого таі і навіщо він тоді?
        System.out.println(getName() + " sing");
    }

    abstract void printFlyInfo();
}
