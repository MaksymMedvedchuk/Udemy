package Lesson5.task1;

public class BalancePrinter {
    public void balancePrinter() {
    }

    int balance = 100;

    void replenishmentBalance(int sumBalance) {
        System.out.println("My balance: " + balance);
        balance += sumBalance;
        System.out.println("Balance replenishment: " + sumBalance);
        System.out.println("My balance after replenishment: " + balance);
        System.out.println();
    }

    void reductionOfBalance(int minusBalance) {
        System.out.println("My balance: " + balance);
        balance -= minusBalance;
        System.out.println("Balance reduction: " + minusBalance);
        System.out.println("My balance after reduction: " + balance);

    }
}

