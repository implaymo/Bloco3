package org.example.Exercicio_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_2_3Test {

    @Test
    void test_constructor() {
        new Exercicio_2_3();
    }

    @Test
    void exercicio_2_3() {
        new Exercicio_2_3();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10, 0",
            "-3, 10, 1",
            "-10, -1, 0",
            "-3, -3, 0",
            "0, 0, 1",
            "0, 15, 2",
            "15,15, 1"
    })
    void should_return_valid_result(int start, int end, int expected){
        // arrange
        // act
        int result = Exercicio_2_3.exercicio_2_3(start,end);
        // assert
        assertEquals(expected, result);
    }
}