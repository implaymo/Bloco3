package org.example.Exercicio_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_2_5Test {

    @Test
    void exercicio_2_5() {
        new Exercicio_2_5();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10, 3, 5, 0",
            "-3, 10, 3, 5, 0",
            "-10, -1, 3, 5, 0",
            "-3, -3, 3, 5, 0",
            "0, 0, 3, 5, 0",
            "0, 15, 3, 5, 15",
    })
    void should_return_valid_result(int start, int end, int number1, int number2, int expected){
        // arrange
        // act
        int result = Exercicio_2_5.exercicio_2_5(start,end, number1, number2);
        // assert
        assertEquals(expected, result);
    }
}