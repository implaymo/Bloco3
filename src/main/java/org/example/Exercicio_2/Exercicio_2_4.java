package org.example.Exercicio_2;

public class Exercicio_2_4 {

    public static int exercicio_2_4(int start, int end, int number1, int number2){
        int totalMultiples = 0;
        for (int i = start; i <= end; i++) {
            int verifyIfMultipleNumber1 = i % number1;
            int verifyIfMultipleNumber2 = i % number2;
            if (verifyIfMultipleNumber1 == 0 && verifyIfMultipleNumber2 == 0){
                totalMultiples++;
            }
        }
        return totalMultiples;
    }
}
