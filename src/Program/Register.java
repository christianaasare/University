package Program;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Nameable> students;


    public Register(List<Nameable> students) {

        this.students = students;
    }

    public List<String> getRegister() {
        List<String> student_names = new ArrayList<>();
        for (Nameable stud : students) {
            student_names.add(stud.getName());
        }
        return student_names;
    }

    public List<String> getRegisterByLevel(Level level) {
        List<String> student_names = new ArrayList<>();
        for (Nameable stud : students) {
            if (stud.getLevel().equals(level)) {
                student_names.add(stud.getName());
            }
    }
        return student_names;
    }
//    public String printReport(){
//
//    }
}