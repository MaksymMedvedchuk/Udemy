package lesson27;

 class Lion extends Mammal{
    public Lion(String name) {
        super(name);
    }

    @Override
    void printEatInfo() {
        System.out.println("Lion as like anybody predator like meat");
    }

    @Override
    void printSleepInfo() {
        System.out.println("Bigger part of the day lion sleeps");
    }

     @Override
     void printRunInfo() {
         System.out.println("Lion isn't the most faster cat");//в завданні не було, але створив, була помилка що клас треба зробити абстрактним чи
     //перезаписати з класа Mammal метод printRunInfo

     }
 }
