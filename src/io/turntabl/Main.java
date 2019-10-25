package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Student> students = Arrays.asList(
            new Student("Ieter Parcer", 10237489, StudentLevel.Final ),
            new Student("Mark Zucker", 1574689, StudentLevel.First ),
            new Student("Francis Paul", 1023478, StudentLevel.Second ),
            new Student("Pope Mats", 1028293, StudentLevel.Third ),
            new Student("Aolly Juckso", 10237489, StudentLevel.Final ),
            new Student("Britney Watmo", 1028293, StudentLevel.First ),
            new Student("Doreen Amengu", 1028293, StudentLevel.Third ),
            new Student("Britney Watmo", 1028293, StudentLevel.Third )
    );

        List<Student> intro_to_programming = new ArrayList<>();
        for(Student stud:students){
            if(stud.getLevel()==StudentLevel.First){
                intro_to_programming.add(stud);
            }
    }
        printProgrammingStudents(intro_to_programming);


        List<Student> advanced_gardening = new ArrayList<>();
        for(Student stud:students){
            if(stud.getLevel()==StudentLevel.Third || stud.getLevel()==StudentLevel.Final){
                advanced_gardening.add(stud);
            }
        }
       printAdvancedGardeningStudent(advanced_gardening);

        List<Student> physics = new ArrayList<>();
        for(Student stud:students){
            if (stud.getLevel()==StudentLevel.Final ){
                physics.add(stud);

            }
        }
        printPhysics(physics);
    }
    private static void printProgrammingStudents(List<Student> students) {
        System.out.println(students);
    }
    private static void printAdvancedGardeningStudent(List<Student> students) {
        System.out.println(students);
    }
    private static void printPhysics(List<Student> students) {
        System.out.println(students);
    }

}
