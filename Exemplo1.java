package Exercicios;

public class Exemplo1 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <=10)
			
		{
			
			System.out.println("Repetição..nr; " + contador);
			
			contador ++;
			
			Thread.sleep(1000);
			
		}
		
	}
	
}
