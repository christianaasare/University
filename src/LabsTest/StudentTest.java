package LabsTest;

import Labs.Level;
import Labs.NaughtyStudent;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        List<Double> studentGrades = Arrays.asList(45.9,52.6,54.4,19.5);
        NaughtyStudent student = new NaughtyStudent("Hacks", studentGrades, Level.Second);
        Double average=student.getAverageGrade();
        assertEquals(43.2, average);
    }
}