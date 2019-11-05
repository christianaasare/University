package LabsTest;

import Labs.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {
        List<Nameable> objects = Arrays.asList(
                new Student("Man",  Arrays.asList(23.4,32.6,56.8), Level.Third),
                new NaughtyStudent("Rachael", Arrays.asList(56.7,134.8,34.5),Level.First),
                new Student("Dale", Arrays.asList(34.3,45.0,55.5),Level.Second)


        );
        Register register = new Register(objects);
        List<String> studentNames= Arrays.asList("Man","Rachael","Dale");
        assertEquals(studentNames,register.getRegister());



    }

    @Test
    void getRegisterByLevel() {
        List<Nameable> objects = Arrays.asList(
                new Student("Billy",  Arrays.asList(23.4,32.6,56.8), Level.Third),
                new Student("Tim", Arrays.asList(56.7,134.8,34.5),Level.First),
                new Student("Tammy", Arrays.asList(34.3,45.0,55.5),Level.Second)
        );
        Register register = new Register(objects);
        List<String> studentLevel= Arrays.asList("Tim");
        assertEquals(studentLevel,register.getRegisterByLevel(Level.First));
    }
}