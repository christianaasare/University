package Test;

import Program.Level;
import Program.Nameable;
import Program.Register;
import Program.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RegisterTest {

    @Test
    void getRegister() {
        List<Nameable> students = Arrays.asList(
                new Student("Jim", Level.First, Arrays.asList(23.0,65.7)),
                new Student("Matt", Level.Third, Arrays.asList(21.0,65.7)),
                new Student("Ruby", Level.Second, Arrays.asList(65.0,87.9,89.0))

        );
        Register register = new Register(students);
        List<String> expected = Arrays.asList("Jim","Matt","Ruby");
        assertEquals(expected,register.getRegister());

    }

    @Test
    void getRegisterByLevel() {
        List<Nameable> students = Arrays.asList(
                new Student("Nuy", Level.Third, Arrays.asList(67.0,87.0,8.0)),
                new Student("treh", Level.First, Arrays.asList(45.4,55.5,78.8))
//                new NaughtyStudent("Akos",Level.SECOND,Arrays.asList(7.2,1.8))
                );

        Register register = new Register(students);
        List<String> expected = Arrays.asList("Nuy");
        assertEquals(expected,register.getRegisterByLevel(Level.Third));
    }
}