package org.example.Exercicio_2;

public class Exercicio_2_2 {

    public static int exercicio_2_2(int begin, int end, int number){
        int totalMultiples = 0;
        for (int i = begin; i <= end; i++) {
            int verifyIfMultiple = i % number;
            if (verifyIfMultiple == 0){
                totalMultiples++;
            }
        }
        return totalMultiples;
    }
}
