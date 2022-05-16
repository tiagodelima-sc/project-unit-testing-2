package br.com.tiagodelima;

public class MathUtil {
	/*
	 * Foi desenvolvido um metodo estatico para nao precisar instanciar.
	 * Instrucao dentro do metodo apenas para ele compilar.
	 * */

	public static int mdc(int valorA, int valorB) {
		
		valorA = Math.abs(valorA);
		valorB = Math.abs(valorB);
		
		
		//Propriedade 6
		//descobrir maior valor
		final int maiorValor = Math.max(valorA, valorB);
		
		valorB = Math.min(valorA, valorB);
		valorA = maiorValor;
		
		//Propriedade 1
		if(valorB > 0 || valorA == 0) {
				return valorB;
		}
		
		//Propriedade 3
		if(valorB == 0) {
			return Math.abs(valorA);
		}
		
		//Propriedade 5
		if(valorA % valorB != 0) {
			return 1;
		}
		
		return -1;
	}

}
