package org.example.Exercicio_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio_2_3Test {

    @Test
    void test_constructor() {
        new Exercicio_2_3();
    }

    @Test
    void should_return_2_if_number_positive_is_3_and_interval_is_negative_3_to_3_and_number_3(){
        // arrange
        // act
        int result = Exercicio_2_3.exercicio_2_3(-3,3);
        // assert
        assertEquals(1,result);
    }

    @Test
    void shoud_return_3_if_range_negative_10_to_negative_1_and_number_3(){
        // arrange
        // act
        int result = Exercicio_2_3.exercicio_2_3(-10,-1);
        // assert
        assertEquals(0,result);
    }

    @Test
    void shoud_return_3_if_range_positive_1_to_positive_3_and_number_3(){
        // arrange
        // act
        int result = Exercicio_2_3.exercicio_2_3(1,10);
        // assert
        assertEquals(0,result);
    }
}