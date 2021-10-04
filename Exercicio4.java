
// Faça um programa em que permita a entrada de um número qualquer e exiba se este
// número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
// ímpar exiba o número elevado ao quadrado.Faça um programa em que permita a entrada 
// de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba 
// também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.


package Exercicios;
import javax.swing.JOptionPane;

	public class Exercicio4 {

	public static void main(String[] args) {
		
		float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Ele é par e a raiz quadrada é: " + Math.sqrt(numero));
		} else {
			JOptionPane.showMessageDialog(null, "Ele é impar e o quadrado dele é: " + Math.pow(numero, 2));
		}
		System.exit(0);
	}
}