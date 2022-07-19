package lesson25.task1;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

//    public Student(StringBuilder name, int course, int grade) {
//        this.name = name;
//        this.course = course;
//        this.grade = grade;

    public void printInfo() {
        System.out.println("Name: " + getName() + "; course: " + getCourse() + "; grade: " + getGrade());
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }
}
