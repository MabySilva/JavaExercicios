
// Faça um programa que entre com três números e coloque em ordem crescente.

package Exercicios;

import java.util.Scanner;
import java.util.Arrays;

	public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double[] numero;
        numero = new double[3];
        
        
        for(int i = 0; i <3; i++) {
            System.out.println("Insira o "+(i+1)+"º número: ");
            numero[i] = leia.nextDouble();
        }
        
        Arrays.sort(numero);
        
        System.out.println("A ordem crescente dos números são: " +Arrays.toString(numero));
        leia.close();
    }
}