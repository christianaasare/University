package Labs;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Student> students = new ArrayList<>();


    public void enter(Student student) {
        this.students.add(student);
    }

    public Double getHighestAverageGrade() {
        Double highestGrade = 0.0;
        for (Student student : students) {
            if (student.getAverageGrade() > highestGrade) {
                highestGrade = student.getAverageGrade();
            }
        }
        return highestGrade;
    }
}
