package Labs;

import java.util.List;

public class Student implements Nameable, HasLevel{
    private String name;
    private List<Double> studentGrades;
    private Level level;

    public Student(String name, List<Double> studentGrades, Level level) {
        this.name = name;
        this.studentGrades = studentGrades;
        this.level = level;
    }

    public List<Double> getStudentGrades() {

        return studentGrades;
    }


    public Double getAverageGrade() {
        Double average;
        Double totalGrade = 0.0;
        for (Double grade : studentGrades) {
            totalGrade += grade;
        }
        average = totalGrade / studentGrades.size();
        return average;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public Level getLevel() {
        return level;
    }
}