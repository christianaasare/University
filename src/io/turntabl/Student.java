package io.turntabl;

public class Student {
    private String name;
    private int student_id;
    private StudentLevel level;

    public Student(String name, int student_id, StudentLevel level) {
        this.name = name;
        this.student_id = student_id;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", student_id=" + student_id +
                ", level=" + level +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public StudentLevel getLevel() {
        return level;
    }
}

