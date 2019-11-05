package UniversityTutorial;

import java.util.List;

public class Course {
    Lecture lecture;
    List<Student> students;
    CourseYear courseYear;

    public Course(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "students=" + students +
                '}';
    }
}
