package lesson5.task1;

public class Runner {
    public static void main(String[] args) {
        Balance balance = new Balance(321);

        balance.replenishBalance(50);
        System.out.println(balance.getBalance());
        balance.reductBalance(25);
        System.out.println(balance.getBalance());

    }
}
