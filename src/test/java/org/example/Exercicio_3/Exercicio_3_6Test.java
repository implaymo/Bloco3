package org.example.Exercicio_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class Exercicio_3_6Test {

    @Test
    void exercicio_5_6() {
        new Exercicio_3_6();
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 3, 2, 0",
            "0,3, 2, 0",
            "-6,-1, 2, -48",
            "0, 0, 2, 0",
            "-3, 0, 2, 0",
            "3, -3, 2, 0",
            "-2, -1, 3, 0"
    })
    void result_should_be_valid(int start, int end, int number, int expected){
        // arrange
        // act
        int result = Exercicio_3_6.exercicio_3_6(start, end, number);
        // assert
        assertEquals(expected, result);
    }
}