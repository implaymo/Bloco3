package org.example.Exercicio_3;

public class Exercicio_3_7 {

    public static double exercicio_3_7(int start, int end, int number) {
        int countMultNumbers = 0;
        int sumMultNumbers = 0;
        double average = 0.0;
        for (int i = start; i <= end; i++){
            if (i % number == 0){
                countMultNumbers++;
                sumMultNumbers += i;
            }
        }
        if (countMultNumbers > 0){
            average = sumMultNumbers / countMultNumbers;
        }
        return average;
    }
}
