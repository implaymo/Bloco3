package org.example.Exercicio_3;

public class Exercicio_3_4 {

    public static int exercicio_3_4(int start, int end){
        int sumOddNumbers = 0;
        for (int i = start; i <= end; i++){
            if (i % 2 != 0){
                sumOddNumbers++;
            }
        }
        return sumOddNumbers;
    }
}
