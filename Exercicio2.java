/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.exercicio1;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int indiceMaior = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                indiceMaior = i;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("Ele está na posição (índice): " + indiceMaior);
    }
}
