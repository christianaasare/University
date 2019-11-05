package LabsTest;

import Labs.Lecture;
import Labs.Level;
import Labs.NaughtyStudent;
import Labs.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    Lecture enter() {
        List<Double> grades1 = Arrays.asList(15.0, 33.0, 34.0);
        Student student1 = new Student("Nate", grades1, Level.First);
        List<Double> grades2 = Arrays.asList(23.8, 34.9);
        Student student2 = new Student("Sim", grades2,Level.Third);
        List<Double> grades3 = Arrays.asList(5.0, 3.0, 4.0);
        Student student3 = new Student("Bridget", grades3,Level.Third);
        List<Double> grades4 = Arrays.asList(23.8, 34.9);
        Student student4 = new Student("Johny", grades4,Level.Second);
        List<Double> naughtyGrades1 = Arrays.asList(13.0,23.0,36.2);
        NaughtyStudent naughtyStudent1 = new NaughtyStudent("Zack",naughtyGrades1,Level.Third);
        List<Double> naughtyGrades2 = Arrays.asList(25.0,13.0,34.0);
        NaughtyStudent naughtyStudent2 = new NaughtyStudent("Theo",naughtyGrades2,Level.Fourth);

        Lecture lecture = new Lecture();
        lecture.enter(student1);
        lecture.enter(student2);
        lecture.enter(student3);
        lecture.enter(naughtyStudent1);
        lecture.enter(naughtyStudent2);

        return lecture;
    }



    @Test
    void getHighestAverageGrade() {
        Lecture lecture = enter();
        Double actual =  lecture.getHighestAverageGrade();
        Double expected = 29.35;
        assertEquals(expected,actual);
    }
    }
