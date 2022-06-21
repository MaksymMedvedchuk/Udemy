package Lessons4;

public class TwoClassCreator {

    int studentTicketNumber;
    String studentName;
    String studentSurname;
    int yearOfStudy;
    double averageGradeInMath;
    double averageGradeInEconomy;
    double averageGradeInEnglish;

    public void printMiddleRating() {

        TwoClassCreator firstStudent = new TwoClassCreator();
        TwoClassCreator secondStudent = new TwoClassCreator();
        TwoClassCreator thirdStudent = new TwoClassCreator();


        firstStudent.studentTicketNumber = 987456;
        firstStudent.studentName = "Maksim";
        firstStudent.studentSurname = "Medvedchuk";
        firstStudent.yearOfStudy = 2012;
        firstStudent.averageGradeInMath = 11.1 ;
        firstStudent.averageGradeInEconomy = 9.8;
        firstStudent.averageGradeInEnglish = 7.1;

        secondStudent.studentTicketNumber = 987124;
        secondStudent.studentName = "Igor";
        secondStudent.studentSurname = "Frank";
        secondStudent.yearOfStudy = 2011;
        secondStudent.averageGradeInMath = 11.1;
        secondStudent.averageGradeInEconomy = 10.2;
        secondStudent.averageGradeInEnglish = 11.5;

        thirdStudent.studentTicketNumber = 989235;
        thirdStudent.studentName = "Daria";
        thirdStudent.studentSurname = "Binevich";
        thirdStudent.yearOfStudy = 2011;
        thirdStudent.averageGradeInMath = 10.8;
        thirdStudent.averageGradeInEconomy = 10.1;
        thirdStudent.averageGradeInEnglish = 11.9;

        System.out.print("Arithmetic mean: " + firstStudent.studentName + " " + firstStudent.studentSurname + " - ");
        System.out.printf("%.1f", ((firstStudent.averageGradeInEconomy + firstStudent.averageGradeInEnglish + firstStudent.averageGradeInMath) / 3));
        System.out.println();
        System.out.print("Arithmetic mean: " + secondStudent.studentName + " " + secondStudent.studentSurname + " - ");
        System.out.printf("%.1f", ((secondStudent.averageGradeInEconomy + secondStudent.averageGradeInEnglish + secondStudent.averageGradeInMath) / 3));
        System.out.println();
        System.out.print("Arithmetic mean: " + thirdStudent.studentName + " " + thirdStudent.studentSurname + " - ");
        System.out.printf("%.1f", ((thirdStudent.averageGradeInEconomy + thirdStudent.averageGradeInEnglish + thirdStudent.averageGradeInMath) / 3));

    }
}















