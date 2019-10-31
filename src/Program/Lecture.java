package Program;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    private List<Student> students= new ArrayList<>();

    public void Enter(Student student){ this.students.add(student);
    }

    public double highestAverageGrade(){
        double highest_grade=0;
        for(Student student: students){
            if(highest_grade<student.getAverageGrades()){
                highest_grade=student.getAverageGrades();
            }
        }
        return highest_grade;
    }
}
