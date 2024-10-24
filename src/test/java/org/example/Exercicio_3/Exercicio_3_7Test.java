package org.example.Exercicio_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_3_7Test {

    @Test
    void exercicio_3_7() {
        new Exercicio_3_7();
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 3, 2, 0",
            "0, 3, 2, 1.0",
            "-6,-1, 2, -4.0",
            "0, 0, 2, 0",
            "-3, 0, 2, -1.0",
            "3, -3, 2, 0",
            "-2, -1, 3, 0",
    })
    void result_should_be_valid(int start, int end, int number, double expected){
        // arrange
        // act
        double result = Exercicio_3_7.exercicio_3_7(start, end, number);
        // assert
        assertEquals(expected, result);
    }

}