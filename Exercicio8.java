/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        // União dos vetores A e B em C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        System.out.println("Vetor C (união de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
