package org.example.Exercicio_2;

import org.example.Exercicio_1.Exercicio_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_2_1Test {

    @Test
    void test_constructor() {
        new Exercicio_2_1();
    }

    @Test
    void should_return_2_if_range_is_negative_3_and_3(){
        // assert
        // act
        int result = Exercicio_2_1.exercicio_2_1(-3, 3);
        // arrange
        assertEquals(3, result);
    }

    @Test
    void should_return_3_if_range_is_1_to_10(){
        // assert
        // act
        int result = Exercicio_2_1.exercicio_2_1(1, 10);
        // arrange
        assertEquals(3, result);
    }
}