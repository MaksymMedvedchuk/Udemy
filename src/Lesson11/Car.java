package Lesson11;

public class Car {
    public String color;  // Чому якщо роблю поле приватним, компілятор видає помилку?
    private String motor;
    public int doorsQuantity; // Чому якщо роблю поле приватним, компілятор видає помилку?

    public Car(String color, String motor, int doorsQuantity) {
        this.color = color;
        this.motor = motor;
        this.doorsQuantity = doorsQuantity;
    }

    public void changeDoorsQuantity(int newDoorsQuantity) {
        this.doorsQuantity = newDoorsQuantity;
    }

    public void changeColor(Car car1, Car car2) {
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
