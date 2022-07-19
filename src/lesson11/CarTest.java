package lesson11;

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car("Red", "V8", 4);
        Car secondCar = new Car("Black", "V10", 2);
        firstCar.setDoorsQuantity(10);
        // firstCar.changeDoorsQuantity(10);
        System.out.println(firstCar.getDoorsQuantity());
        Car.changeColor(firstCar, secondCar);
        System.out.println(firstCar.getColor());
        System.out.println(secondCar.getColor());

    }
}
