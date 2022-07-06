package Lesson11;

public class Car {
    private String color;
    private String motor;
    public int quantityDoors;

    public Car(String color, String motor, int quantityDoors) {
        this.color = color;
        this.motor = motor;
        this.quantityDoors = quantityDoors;
    }

    public int changeQuantityDoors(int newQuantityDoors) {
        newQuantityDoors = newQuantityDoors - 2;
        return newQuantityDoors;
    }

    public static void changeColor(Car car1, Car car2) {
        Car car3 = car1;
        car1 = car2;
        car2 = car3;
        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}
