package br.com.tiagodelima;

public class MathUtil {
	/*
	 * Foi desenvolvido um metodo estatico para nao precisar instanciar.
	 * Instrucao dentro do metodo apenas para ele compilar.
	 * */

	public static int mdc(int valorA, int valorB) {
		if(valorB > 0) {
			if(valorA % valorB == 0) {
				return valorB;
			}
		}
		
		return -1;
	}

}
