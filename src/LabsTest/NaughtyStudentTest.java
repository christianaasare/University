package LabsTest;

import Labs.Level;
import Labs.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrade() {
        List<Double> studentGrades = Arrays.asList(34.9,55.6,55.4,33.5);
        Student student = new Student("Tina", studentGrades, Level.Third);
        Double average=student.getAverageGrade();
        assertEquals(44.85, average);

    }
}