package org.example.Exercicio_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_3_2Test {

    @Test
    void test_constructor() {
        new Exercicio_3_2();
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 3, 3",
            "0,3, 2",
            "-6,-1, 3",
            "0,0, 1",
            "-3, 0, 2"
    })
    void result_should_be_valid(int start, int end, int expected){
        // arrange
        // act
        int result = Exercicio_3_2.exercicio_3_2(start, end);
        // assert
        assertEquals(expected, result);
    }
}