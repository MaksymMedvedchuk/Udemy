package lesson16;

public class Email {

    public void printEmailInfo(String arg) {
        int arg1 = 0; //позиція символу @
        int arg2 = 0; //позиція символу .  щоб між . та @ знайти substring
        int arg3 = 0; //позиція символу ; щоб розуміть коли закінчувати пошук substring

        while (arg3 < arg.length() -1 ) { //-1 - довжина string на -1 индекс менше 40 (39), щоб цикл заверш. на 39 инд
            arg1 = arg.indexOf('@', arg3);//шукаю @ з 0 символу = 2
            arg2 = arg.indexOf('.', arg3); // шукаю . з 0 символу = 8
            arg3 = arg.indexOf(';', arg3 + 1); //+1 для що шукало не з ";", а з наступного елемкнту, на крок вперед
            System.out.println(arg.substring(arg1 + 1, arg2));  //arg2 8 індекс "." не виводиться на єкран
        }
    }
}
















