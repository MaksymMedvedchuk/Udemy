package lesson13;

public class Month {

    public static void printNumberDaysMonth(String nameMonth) {

        switch (nameMonth) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("This month has 31 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("This month has 30 days");
                break;
            case "February":
                System.out.println("This month has 28 days");
            default:
                System.out.println("There is no such month");
        }
    }
}
