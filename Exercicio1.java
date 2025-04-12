/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.exercicio1;

/**
 *
 * @author danie
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 3, 2, 10, 7, 1, 4, 6, 9};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
