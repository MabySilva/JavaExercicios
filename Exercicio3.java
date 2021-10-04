
// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
// categoria ela se encontra: 10-14 Infaltil 15-17 Juvenil 19-25 Adulto

package Exercicios;

import java.util.Scanner;

		public class Exercicio3 {
		public static void main(String[] args) {
		
			int idade = 0;
			String nome;
		
			Scanner leia = new Scanner(System.in);
		
			System.out.println("Digite aqui o seu nome: ");
				nome = leia.next();
			System.out.println("Digite a sua idade: ");
				idade = leia.nextInt();
		
			if (idade >= 10 && idade <= 14) {
				System.out.println(nome +" pertence a categoria Infantil.");
			}
		
			else if (idade >= 15 && idade <= 17) {
				System.out.println(nome +" pertence a categoria Juvenil.");
			}
		
			else if (idade >= 18 && idade <= 25) {
				System.out.println(nome +" pertence a categoria Adulto.");
			}
		
			else {
				System.out.println("Sinto muito " + nome +", você não pertence á nenhuma categoria.");
			}
		
			leia.close();
		
		

		}

}
