package Lesson11;

public class Car {
    private String color;
    private String motor;
    private int doorsQuantity;

    public Car(String color, String motor, int doorsQuantity) {
        this.color = color;
        this.motor = motor;
        this.doorsQuantity = doorsQuantity;
    }

    public static  void changeColor(Car car1, Car car2) {
       String color = car1.color;
        car1.color = car2.color;
        car2.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getDoorsQuantity() {
        return doorsQuantity;
    }

    public void setDoorsQuantity(int doorsQuantity) {
        this.doorsQuantity = doorsQuantity;
    }
}
