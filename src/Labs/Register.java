package Labs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Nameable> objects;
    List<Student> students;


    public Register(List<Student> students) {
        this.students = students;
    }

    public List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();
//        for(Nameable object: objects){
//            studentNames.add(object.getName());
//        }
//        return studentNames;
        return students.stream().map(Student::getName).collect(Collectors.toList());
    };

    public List<String> getRegisterByLevel(Level level){
//        List<String> studentNames = new ArrayList<>();
//        for(Nameable object:objects){
//            if(object.getLevel().equals(level))
//                studentNames.add(object.getName());
//        }
//        return studentNames;
        return students.stream().filter(student -> student.getLevel() == Level.First).map(Student::getName).collect(Collectors.toList());
    }

    public String printReport() {
        String format = "";
        for (Nameable stud : objects) {
            format += "Student Name: " + stud.getName() + " " + "Level: " + stud.getLevel() + "/n";
        }
        System.out.println(format);
        return format;
    }
}

