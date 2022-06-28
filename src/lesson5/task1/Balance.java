package lesson5.task1;

public class Balance {

    public Balance(int balance) {

        this.balance = balance;
    }

    private int balance;

    void replenishBalance(int amount) {
        balance += amount;

    }

    void reductBalance(int amount) {
        balance -= amount;

    }

    public int getBalance() {

        return balance;
    }
}

//чому для вивода на консоль ми тут використовуємо гетер в класі Runner? Чому не можна вивети в цьому класі через soup?

