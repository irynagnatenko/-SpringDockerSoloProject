package com.example.springdocker.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Iryna Gnatenko
 * Date 2021-05-27
 * Time 5:20 PM
 * Project springdocker
 */
class MyMathCalcTest {
    private MyMathCalc myMathCalc;

    @BeforeEach
    void start() {
        myMathCalc = new MyMathCalc();
    }

    @DisplayName("Testing add method")
    @Test
    void testAdd(){
        int expected = 4;
        int notExpected = 5;
        int actual = myMathCalc.add(2,2);

        assertEquals(expected,actual);
        assertNotEquals(notExpected,actual);
    }

    @DisplayName("Testing substract method")
    @Test
    void testSubstract() {
        int expected = 2;
        int notExpected = 3;
        int actual = myMathCalc.substract(5,3);

        assertEquals(expected,actual);
        assertNotEquals(notExpected,actual);
    }

    @DisplayName("Testing multiply method")
    @Test
    void testMultiply() {
        int expected = 10;
        int notExpected = 100;
        int actual = myMathCalc.multiply(2,5);

        assertEquals(expected,actual);
        assertNotEquals(notExpected,actual);
    }

    @DisplayName("Testing divide method")
    @Test
    void testDivide() {
        int expected = 5;
        int notExpected = 2;
        double actual = myMathCalc.divide(10,2);

        assertEquals(expected,actual);
        assertNotEquals(notExpected,actual);
    }


    @DisplayName("Testing dividing by 0")
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class ,() -> myMathCalc.divide(10,0));
    }
}
