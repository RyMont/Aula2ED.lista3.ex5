package controller;

public class FibonacciController {
	public int calculaFibonacci(int n) {
		
		/*
		 * caso base n == 1 ou n ==2
		 * 
		 * definicao da serie de fibonacci, retorna 1 para ambos os casos
		 */
		if (n == 1 || n == 2) {
			return 1;
		}
		
		/*
		 * denovo a definicao da serie conforme a formula recursiva
		 * soma todos os casos antes do base (1 e 2 retornam 1)
		 */
		return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
	}
}
