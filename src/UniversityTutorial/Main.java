package UniversityTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Cindy", 1656,StudentYear.First),
                new Student("Issac",3648,StudentYear.Fourth),
                new Student("Jude",4758,StudentYear.Third),
                new Student("Noel", 4756,StudentYear.Fourth),
                new Student("Kim",7489,StudentYear.First),
                new Student("Shane", 7739,StudentYear.First),
                new Student("Eunice",4489,StudentYear.Fourth),
                new Student("Pete",8759,StudentYear.Third),
                new Student("Eric", 8699,StudentYear.Fourth),
                new Student("Lady",4657,StudentYear.First)

        );

        List<Student> firstYearStudents = new ArrayList<>();
        for(Student student: students){
            if(student.getStudent_year() == StudentYear.First){
                firstYearStudents.add(student);
            }
        }
        System.out.println(firstYearStudents);


        Course introToProgramming = new Course(firstYearStudents);
        System.out.println(introToProgramming);


        List<Student> thirdAndFourthYearStudents = new ArrayList<>();
        for(Student student: students){
            if(student.getStudent_year() == StudentYear.Third && student.getStudent_year()==StudentYear.Fourth){
                thirdAndFourthYearStudents.add(student);
            }
        }
        System.out.println(thirdAndFourthYearStudents);


        Course advancedGardening = new Course(thirdAndFourthYearStudents);
        System.out.println(advancedGardening);

        List<Student> fourthYearStudents = new ArrayList<>();
        for(Student student: students){
            if( student.getStudent_year()==StudentYear.Fourth && student.getName().startsWith("A") ||
                    student.getName().startsWith("E") ||
                    student.getName().startsWith("I") ||
                    student.getName().startsWith("O") ||
                    student.getName().startsWith("U")){
               fourthYearStudents.add(student);
            }
        }
        System.out.println(fourthYearStudents);

        Course physics = new Course(thirdAndFourthYearStudents);
        System.out.println(physics);

    }

}
