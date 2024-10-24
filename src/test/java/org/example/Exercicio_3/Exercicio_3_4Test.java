package org.example.Exercicio_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_3_4Test {

    @Test
    void exercicio_3_4() {
        new Exercicio_3_4();
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 3, 4",
            "0,3, 2",
            "-6,-1, 3",
            "0,0, 0",
            "-3, 0, 2"
    })
    void result_should_be_valid(int start, int end, int expected){
        // arrange
        // act
        int result = Exercicio_3_4.exercicio_3_4(start, end);
        // assert
        assertEquals(expected, result);
    }
}