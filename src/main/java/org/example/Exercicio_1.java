package org.example;

public class Exercicio_1 {

    public static int factorial(int number){
        // O algoritmo realiza a operaçao factorial de um numero inteiro
        int res = 1;
        for (int i = number; i > 0; i--) {
            res = res * i;
        }
        return res;
    }
}