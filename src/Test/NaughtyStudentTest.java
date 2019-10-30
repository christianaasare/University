package Test;

import Program.NaughtyStudent;
import Program.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrades() {
        List<Double> grades= Arrays.asList(12.0,34.0,45.0,12.0);
        NaughtyStudent student = new NaughtyStudent(grades);
        double average_grade = student.getAverageGrades();
        assertEquals(25.85, average_grade);

    }
}