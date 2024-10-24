package org.example.Exercicio_2;

public class Exercicio_2_1 {

    public static int exercicio_2_1(int begin, int end){

        int numberOfMultiples = 0;
        for (int i = begin; i < end; i++) {
            int verifyIfMultiple = i % 3;

            if (verifyIfMultiple == 0){
                numberOfMultiples++;
            }
        }
        return numberOfMultiples;
    }
}
