	
//1- Façam um grama que receba tresinteiros e diga qual deles é o maior

		package Exercicios;

			import java.util.Scanner;

				public class Exercicio1{

					public static void main(String[] args) {
					
					Scanner ler = new Scanner(System.in);

					int valor1, valor2, valor3, maiorDado;
	
						System.out.println("Digite o primeiro valor: ");
						valor1 = ler.nextInt();
	
						System.out.println("Digite o segundo valor: ");
						valor2 = ler.nextInt();
	
						System.out.println("Digite o terceiro valor:");
						valor3 = ler.nextInt();
	
							if(valor1 > valor2 && valor1 > valor3) {
							maiorDado = valor1;
			} 
							else if (valor2 > valor3) {
							maiorDado = valor2;
			} 
							else {
							maiorDado = valor3;
	}
							System.out.println("O valor maior é o némero: " + maiorDado);
		

}
}
