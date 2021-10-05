package Exercicios;

public class Exemplo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int contador = 10;
		
		while(contador >=0)
			
		{
			
			System.out.println("Repetição..nr; " + contador);
			
			contador -- ;
			
			Thread.sleep(1000);
			
		}
		
	}
	
}

