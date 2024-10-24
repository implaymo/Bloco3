package org.example.Exercicio_2;

public class Exercicio_2_3 {

    public static int exercicio_2_3(int begin, int end){
        int totalMultiples = 0;
        for (int i = begin; i <= end; i++) {
            int verifyIfMultiple3 = i % 3;
            int verifyIfMultiple5 = i % 5;
            if (verifyIfMultiple3 == 0 && verifyIfMultiple5 == 0){
                totalMultiples++;
            }
        }
        return totalMultiples;
    }
}
