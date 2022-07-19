package lesson25.task2;

public class Dog extends Pet {

    public Dog(int eyes, String name, int tail, int paw) {
        super(eyes, name, tail, paw);
        System.out.println("I am dog and my name is: " + getName());
    }
    public void printPlayInfo(){
        System.out.println("Dogs play");
    }
    //чому не можна визвати гетери і сетери?
}


