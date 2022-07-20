package lesson25.task1;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

//    public Student(StringBuilder name, int course, int grade) { //попередньо не було перевірок сеттерів в конструкторі,
//        // треба звернутись до полів в конструкторі, теж через сеттери
//        setName(name);
//        setCourse(course);
//        setGrade(grade);
//    }

    public void printInfo() {
        System.out.println("Name: " + getName() + "; course: " + getCourse() + "; grade: " + getGrade());
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() < 3) throw new IllegalArgumentException("Your name is less three chars"); //прокидуєм ексепшнп
        // для генерації виключення і якщо умова виконкється в нас викидує ексепшен і далі код не виконується
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 1 || course > 4)
            throw new IllegalArgumentException("Your course is not in the interval from 1 to 4");
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 10)
            throw new IllegalArgumentException("Your grade is not in the interval from 1 to 10");
        this.grade = grade;
    }
}


