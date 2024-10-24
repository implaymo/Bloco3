package org.example.Exercicio_3;

public class Exercicio_3_8 {

    public static String exercicio_3_8(int start, int end, int numberX, int numberY) {
        double multNumbersX = multNumber(start,end,numberX);
        double multNumbersY = multNumber(start, end, numberY);
        return multNumbersX + " " + multNumbersY;
    }

    public static double multNumber(int start, int end, int number) {
        double countMultNumbers = 0;
        double sumMultNumbers = 0;
        double average = 0.0;
        for (int i = start; i <= end; i++) {
            if (i % number == 0) {
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
