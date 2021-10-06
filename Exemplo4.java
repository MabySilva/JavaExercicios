package Exercicios;

public class Exemplo4 {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		do {
			System.out.println("Repetição...nr: " + i );
			++i;
			Thread.sleep(1000);
		}
		
		while (i !=10);
		
	}

}
