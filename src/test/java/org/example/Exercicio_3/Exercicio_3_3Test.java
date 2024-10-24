package org.example.Exercicio_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_3_3Test {

    @Test
    void exercicio_3_3() {
        new Exercicio_3_3();
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 3, 0",
            "0,3, 4",
            "-6,-1, -9",
            "0,0, 0",
            "-3, 0, -4"
    })
    void result_should_be_valid(int start, int end, int expected){
        // arrange
        // act
        int result = Exercicio_3_3.exercicio_3_3(start, end);
        // assert
        assertEquals(expected, result);
    }
}