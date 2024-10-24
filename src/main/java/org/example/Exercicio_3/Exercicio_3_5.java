package org.example.Exercicio_3;

public class Exercicio_3_5 {
    public static int exercicio_3_5(int start, int end, int number) {
        int totalSumMultNumbers = 0;
        int temp = 0;
        if (start > end) {
            temp = end;
            end = start;
            start = temp;
        }

        for (int i = start; i <= end; i++){
            if (i % number == 0){
                totalSumMultNumbers += i;
            }
        }
        return totalSumMultNumbers;
    }
}
