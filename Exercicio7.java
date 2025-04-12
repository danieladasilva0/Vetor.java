/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que deseja contar: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vez(es) no vetor.");
    }
}

