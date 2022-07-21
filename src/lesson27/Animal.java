package lesson27;

abstract class Animal {

    private String name;

    public Animal(String name) {this.name = name;}

    abstract void printEatInfo();

    abstract void printSleepInfo();

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
