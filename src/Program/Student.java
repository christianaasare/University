package Program;

import java.util.ArrayList;
import java.util.List;

public class Student
    implements Nameable, HasLevel{
    private String name;
    private Level level;
    private List<Double> grades;

    public Student(String name, Level level, List<Double> grades) {
        this.name = name;
        this.level = level;
        this.grades=grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", grades=" + grades +
                '}';
    }

    @Override
    public Level getLevel() {
        return level;
    }

    @Override
    public String getName() {
        return name;


    }



    public Double getAverageGrades() {
       Double result=0.0;
       for(Double grade : grades){
            result += grade;
       }
        return result / grades.size();
    }
}

