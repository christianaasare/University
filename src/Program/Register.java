package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
    private List<Nameable> students;


    public Register(List<Nameable> students) {

        this.students = students;
    }
//
//    public Optional<Student> getName(Student name){
//
//        if((name)){
//            return Optional.of(getName(name))
//        }
//        else{
//            return Optional.empty();
//        }
//    }

//    public List<String> getRegister() {
//        List<String> student_names = new ArrayList<>();
//        for (Nameable stud : students) {
//            student_names.add(stud.getName());
//        }
//        return student_names;
//    }
public List<String> getRegister(){
        List<String> student_names=students.stream().map(std->std.getName()).collect(Collectors.toList());
        return student_names;
    }

     public List<String> getRegisterByLevel(Level level){
        List<String> student_names =students.stream().filter(stud->stud.getLevel()== level.Third)
                .map(student->student.getName())
                .collect(Collectors.toList());
        return student_names;
    }
//    public List<String> getRegisterByLevel(Level level) {
//        List<String> student_names = new ArrayList<>();
//        for (Nameable stud : students) {
//            if (stud.getLevel().equals(level)) {
//                student_names.add(stud.getName());
//            }
//        }
//        return student_names;
//    }

    public String printReport() {
        String format = "";
        for (Nameable stud : students) {
            format += "Student Name: " + stud.getName() + " " + "Level: " + stud.getLevel() + "/n";
        }
            System.out.println(format);
        return format;
    }

}