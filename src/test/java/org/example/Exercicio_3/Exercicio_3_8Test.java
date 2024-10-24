package org.example.Exercicio_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_3_8Test {

    @Test
    void test_constructor() {
        new Exercicio_3_8();
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 3, 2, 3, 0.0 0.0",
            "0, 3, 2, 3, 1.0 1.5",
            "-6,-1, 2, 3, -4.0 -4.5",
            "0, 0, 2, 3, 0.0 0.0",
            "-3, 0, 2, 3, -1.0 -1.5",
            "3, -3, 2, 3, 0.0 0.0",
            "-2, -1, 3, 3, 0.0 0.0",
            "1, 10, 3, 5, 6.0 7.5"
    })
    void result_should_be_valid(int start, int end, int numberX, int numberY, String expected){
        // arrange
        // act
        String result = Exercicio_3_8.exercicio_3_8(start, end, numberX, numberY);
        // assert
        assertEquals(expected, result);
    }
}