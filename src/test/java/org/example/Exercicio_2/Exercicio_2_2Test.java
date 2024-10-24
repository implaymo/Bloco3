package org.example.Exercicio_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_2_2Test {

    @Test
    void test_constructor() {
        new Exercicio_2_2();
    }

    @Test
    void should_return_2_if_number_positive_is_3_and_interval_is_negative_3_to_3_and_number_3(){
        // arrange
        // act
        int result = Exercicio_2_2.exercicio_2_2(-3,3,3);
        // assert
        assertEquals(3,result);
    }

    @Test
    void shoud_return_3_if_range_negative_10_to_negative_1_and_number_3(){
        // arrange
        // act
        int result = Exercicio_2_2.exercicio_2_2(-10,-1,3);
        // assert
        assertEquals(3,result);
    }

    @Test
    void shoud_return_3_if_range_positive_1_to_positive_3_and_number_3(){
        // arrange
        // act
        int result = Exercicio_2_2.exercicio_2_2(1,10,3);
        // assert
        assertEquals(3,result);
    }
}