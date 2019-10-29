package Test;

import maths.Numbers;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void getSum() {
        int sum = Numbers.getSum(2,6);
        assertEquals(8, sum);
    }

    @org.junit.jupiter.api.Test
    void isPositive() {
        boolean isPositive = Numbers.isPositive(3);
        assertTrue(isPositive);
    }
    @org.junit.jupiter.api.Test
    void isPositive2() {
        boolean isNegative = Numbers.isPositive(-3);
        assertFalse(isNegative);
    }

    @org.junit.jupiter.api.Test
    void isNegative() {
        boolean isNegative = Numbers.isNegative(-6);
        assertTrue(isNegative);
    }
    @org.junit.jupiter.api.Test
    void isNegative2() {
        boolean isPositive = Numbers.isNegative(6);
        assertFalse(isPositive);
    }

    @org.junit.jupiter.api.Test
    void isEvenAndGreaterThanZero() {
        boolean isEvenAndGreaterThanZero = Numbers.isEvenAndGreaterThanZero(6);
        assertTrue(isEvenAndGreaterThanZero);
    }
    @org.junit.jupiter.api.Test
    void isEvenAndGreaterThanZero2() {
        boolean isNotEvenAndGreaterThanZero = Numbers.isEvenAndGreaterThanZero(-3);
        assertFalse(isNotEvenAndGreaterThanZero);
    }
    @org.junit.jupiter.api.Test
    void isLeapYear() {
        boolean isLeapYear= Numbers.isLeapYear(2020);
        assertTrue(isLeapYear);
    }

    @org.junit.jupiter.api.Test
    void isLeapYear2() {
        boolean isNotLeapYear= Numbers.isLeapYear(2018);
        assertFalse(isNotLeapYear);
    }
}