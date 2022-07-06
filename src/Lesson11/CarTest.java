package Lesson11;

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car("Red", "V8", 4);
        Car secondCar = new Car("Black", "V10", 2);
        Car.changeColor(firstCar, secondCar);
        System.out.println(firstCar.changeQuantityDoors(firstCar.quantityDoors));
    }
}
