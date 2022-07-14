package lesson16;

public class Email {
    private static final char AT = '@';
    private static final char DOT = '.';
    private static final char SEMICOLON = ';';

    public void printEmailInfo(String inputString) {
        int atPosition;
        int dotPosition;
        int semicolonPosition = 0; //позиція символу ; щоб розуміть коли закінчувати пошук substring

        while (semicolonPosition < inputString.length() -1 ) { //-1 - довжина string на -1 индекс менше 40 (39), щоб цикл заверш. на 39 инд
            atPosition = inputString.indexOf(AT, semicolonPosition);//шукаю @ з 0 символу = 2
            dotPosition = inputString.indexOf(DOT, semicolonPosition); // шукаю . з 0 символу = 8
            semicolonPosition = inputString.indexOf(SEMICOLON, semicolonPosition + 1); //+1 для що шукало не з ";", а з наступного елемкнту, на крок вперед
            System.out.println(inputString.substring(atPosition + 1, dotPosition));  //dotPosition 8 індекс "." не виводиться на єкран
        }
    }
}
















