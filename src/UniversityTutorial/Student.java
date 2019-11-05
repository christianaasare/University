package UniversityTutorial;

public class Student {
    private String name;
    private int id;
    private StudentYear student_year;

    public Student(String name, int id, StudentYear student_year) {
        this.name = name;
        this.id = id;
        this.student_year = student_year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", student_year=" + student_year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public StudentYear getStudent_year() {
        return student_year;
    }


}
