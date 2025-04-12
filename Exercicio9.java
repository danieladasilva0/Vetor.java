/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6];
        int k = 0;
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

    
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    C[k] = A[i];
                    k++;
                    break;
                }
            }
        }

        System.out.print("Interseção entre os vetores A e B: ");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
