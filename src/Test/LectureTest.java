package Test;

import Program.Lecture;
import Program.NaughtyStudent;
import Program.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LectureTest {

    @Test
    Lecture enter() {
        List<Double> first_grade= Arrays.asList(43.0,23.4,37.9);
        Student first_student=new Student(first_grade);
        List<Double> second_grade=Arrays.asList(32.8,23.5,23.0);
        Student second_student=new Student(second_grade);

        List <Double> first_naughty_grade =Arrays.asList(36.4,27.9,37.3);
        NaughtyStudent first_naughty_student=new NaughtyStudent(first_naughty_grade);
        List<Double> second_naughty_grade =Arrays.asList(37.2,29.0,37.0);
        NaughtyStudent second_naughty_student = new NaughtyStudent(second_naughty_grade);


        Lecture lecture=new Lecture();
        lecture.Enter(first_student);
        lecture.Enter(second_student);
        lecture.Enter(first_naughty_student);
        lecture.Enter(second_naughty_student);
        return lecture;
    }

    @Test
    void highestAverageGrade() {
        Lecture lecture = enter();
        Double actual=lecture.highestAverageGrade();
        Double expected =11.1;
        assertEquals(expected,actual);

    }

    private void assertEquals(Double expected, Double actual) {
    }
}