package org.example.Exercicio_3;

public class Exercicio_3_2 {

    public static int exercicio_3_2(int start, int end) {
        int totalEvenNumbers = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                totalEvenNumbers++;
            }
        }
        return totalEvenNumbers;
    }
}
