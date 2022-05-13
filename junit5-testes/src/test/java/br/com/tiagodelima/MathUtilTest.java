package br.com.tiagodelima;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathUtilTest {

	@Test
	void mdc() {
		
		int valorA = 6;
		int valorB = 3;
		int resultadoEsperado = 3;
		
		int resultadoObtido = MathUtil.mdc(valorA, valorB);

		assertEquals(resultadoEsperado, resultadoObtido);
		
	}

}
