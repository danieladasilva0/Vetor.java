/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.exercicio5;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        int acimaDaMedia = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Média dos valores: " + media);
        System.out.println("Quantidade de elementos acima da média: " + acimaDaMedia);
    }
}
