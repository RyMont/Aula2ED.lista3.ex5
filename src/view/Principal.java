package view;

import javax.swing.JOptionPane;
import controller.FibonacciController;

public class Principal {
	public static void main(String[] args) {
		int num;
		FibonacciController fc = new FibonacciController();
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor até 20: "));
		} while (num > 20);
		
		int resultado = fc.calculaFibonacci(num);
		
		System.out.print("O resultado é: " +resultado);
	}
}
