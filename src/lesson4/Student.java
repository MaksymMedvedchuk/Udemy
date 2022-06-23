package lesson4;

public class Student {

    private int studentTicketNumber;
    private String studentName;
    private String studentSurname;
    private int yearOfStudy;
    private double averageGradeInMath;
    private double averageGradeInEconomy;
    private double averageGradeInEnglish;

    public Student(int studentTicketNumber, String studentName, String studentSurname, int yearOfStudy, double averageGradeInMath, double averageGradeInEconomy, double averageGradeInEnglish) {
        this.studentTicketNumber = studentTicketNumber;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.yearOfStudy = yearOfStudy;
        this.averageGradeInMath = averageGradeInMath;
        this.averageGradeInEconomy = averageGradeInEconomy;
        this.averageGradeInEnglish = averageGradeInEnglish;
    }

    public void printAverageGrade() {
        System.out.print("Arithmetic mean: " + this.studentName + " " + this.studentSurname + " - ");
        System.out.printf("%.1f", calculateAverageGrade());
        System.out.println();
    }

    private double calculateAverageGrade() {
        return (this.averageGradeInEconomy + this.averageGradeInEnglish + this.averageGradeInMath) / 3;
    }

    public int getStudentTicketNumber() {
        return studentTicketNumber;
    }

    public void setStudentTicketNumber(int studentTicketNumber) {
        this.studentTicketNumber = studentTicketNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getAverageGradeInMath() {
        return averageGradeInMath;
    }

    public void setAverageGradeInMath(double averageGradeInMath) {
        this.averageGradeInMath = averageGradeInMath;
    }

    public double getAverageGradeInEconomy() {
        return averageGradeInEconomy;
    }

    public void setAverageGradeInEconomy(double averageGradeInEconomy) {
        this.averageGradeInEconomy = averageGradeInEconomy;
    }

    public double getAverageGradeInEnglish() {
        return averageGradeInEnglish;
    }

    public void setAverageGradeInEnglish(double averageGradeInEnglish) {
        this.averageGradeInEnglish = averageGradeInEnglish;
    }
}















