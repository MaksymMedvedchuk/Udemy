package Lesson11;

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car("Red", "V8", 4);
        Car secondCar = new Car("Black", "V10", 2);
        firstCar.changeDoorsQuantity(10);
        System.out.println(firstCar.doorsQuantity);
        firstCar.changeColor(firstCar, secondCar);
        System.out.println(firstCar.color);
        System.out.println(secondCar.color);

    }
}
