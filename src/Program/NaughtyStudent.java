package Program;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    @Override
    public Double getAverageGrades() {
        Double average_grades = super.getAverageGrades();
        average_grades=average_grades+0.1;
        return average_grades;
    }

}
