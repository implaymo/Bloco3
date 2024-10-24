package org.example.Exercicio_2;

public class Exercicio_2_5 {

    public static int exercicio_2_5(int start, int end, int number1, int number2){
        int totalSumMultiples = 0;
        for (int i = start; i <= end; i++) {
            int verifyIfMultipleNumber1 = i % number1;
            int verifyIfMultipleNumber2 = i % number2;
            if (verifyIfMultipleNumber1 == 0 && verifyIfMultipleNumber2 == 0){
                totalSumMultiples += i;
            }
        }
        return totalSumMultiples;
    }
}
