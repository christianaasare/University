package Labs;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(String name, List<Double> studentGrades, Level level) {
        super(name, studentGrades, level);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Double getAverageGrade() {
        Double studentAverage = super.getAverageGrade();
        return studentAverage + 0.1;
    }

}
