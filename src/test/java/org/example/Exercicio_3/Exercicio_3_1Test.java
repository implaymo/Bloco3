package org.example.Exercicio_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_3_1Test {

    @Test
    void test_constructor() {
        new Exercicio_3_1();
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 3, 0",
            "0,3, 2",
            "-6,-1, -12",
            "0,0, 0",
            "-3, 0, -2"
    })
    void result_should_be_valid(int start, int end, int expected){
        // arrange
        // act
        int result = Exercicio_3_1.exercicio_3_1(start, end);
        // assert
        assertEquals(expected, result);
    }
}