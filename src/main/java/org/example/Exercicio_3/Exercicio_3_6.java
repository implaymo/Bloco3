package org.example.Exercicio_3;

public class Exercicio_3_6 {

    public static int exercicio_3_6(int start, int end, int number) {
        int multNumbers = 1;
        int totalMultNumbers = 0;
        for (int i = start; i <= end; i++){
            if (i % number == 0){
                multNumbers *= i;
                totalMultNumbers++;
            }
        }
        if (totalMultNumbers == 0){
            return 0;
        }
        return multNumbers;
    }
}