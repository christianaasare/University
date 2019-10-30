package Program;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Double> grades;

    public Student(List<Double> grades) {

        this.grades = grades;
    }

    public Double getAverageGrades() {
       Double result=0.0;
       for(Double grade : grades){
            result += grade;
       }
        return result / grades.size();
    }
}

