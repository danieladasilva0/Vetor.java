/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que deseja remover: ");
        int numeroParaRemover = scanner.nextInt();

        boolean encontrado = false;
        int[] novoVetor = new int[9];
        int j = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroParaRemover && !encontrado) {
                encontrado = true;
                continue; // pula a primeira ocorrência
            }
            if (j < novoVetor.length) {
                novoVetor[j] = numeros[i];
                j++;
            }
        }

        if (encontrado) {
            System.out.println("Vetor após remover o número:");
            for (int i = 0; i < novoVetor.length; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("Número não encontrado no vetor.");
        }
    }
}
