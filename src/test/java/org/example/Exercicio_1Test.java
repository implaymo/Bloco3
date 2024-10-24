package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_1Test {

    @ParameterizedTest
    @CsvSource({

    })
    void describeExercise() {
        new Exercicio_1();
    }

    @Test
    void factorial_with_positive_number() {
        // arrange
        int numberTested = 5;

        // act
        int factorialOperation = Exercicio_1.factorial(numberTested);

        // assert
        assertEquals(120, factorialOperation, 0.0001);
    }

    @Test
    void factorial_with_negative_number_should_return_1() {
        // arrange
        int numberTested = -1;

        // act
        int factorialOperation = Exercicio_1.factorial(numberTested);

        // assert
        assertEquals(1, factorialOperation);
    }

    @Test
    void factorial_with_0_should_return_1() {
        // arrange
        int numberTested = -1;

        // act
        int factorialOperation = Exercicio_1.factorial(numberTested);

        // assert
        assertEquals(1, factorialOperation);
    }

}