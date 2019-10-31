package Test;

import Program.Level;
import Program.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrades() {
       List<Double> grades=Arrays.asList(12.0,34.0,45.0,12.0);
       Student student = new Student("Jaba", Level.Fourth,grades);
       double average_grade = student.getAverageGrades();
       assertEquals(25.75,average_grade);


    }
}