package br.com.tiagodelima;

import static org.junit.jupiter.api.Assertions.*;

import static br.com.tiagodelima.MathUtil.mdc;
import org.junit.jupiter.api.Test;

class MathUtilTest {

	@Test
	void mdc() {
		
		final int valorA = 6;
		final int valorB = 3;
		final int resultadoEsperado = 3;
		
		int resultadoObtido = MathUtil.mdc(valorA, valorB);

		assertEquals(resultadoEsperado, resultadoObtido);
		
	}
	

	@Test
	void testMdcP2_TestandoNumerosPares() {
		
		final int valorA = 16;
		final int valorB = 8;
		final int divisor = 4;
		
		int resultadoObtido = MathUtil.mdc(valorA, valorB);
		
		//verificar se o resto da divisão do resultado obtido é igual a 0
		assertTrue(resultadoObtido % divisor == 0);
	}
	
	/* Considerando que todo os números são fatores de 0 (pois 0 = 0.a para qualquer a inteiro)
	 * então mdc(a,0) = |a|;
	 * */
	@Test
	void testMdc_Propriedade3_ValorPositivo(){
		
		final int valorA = 15;
		final int valorB = 0;
		final int resultadoEsperado = 15;
		
		final int resultadoObtido = MathUtil.mdc(valorA, valorB);
		
		//verificar se o resultadoObtido é igual resultadoEsperado
		assertEquals(resultadoEsperado, resultadoObtido);
		
	}
	
	@Test
	void testMdc_Propriedade3_ValorNegativo(){
		
		final int valorA = -30;
		final int valorB = 0;
		final int resultadoEsperado = 30;
		
		final int resultadoObtido = MathUtil.mdc(valorA, valorB);
		
		//verificar se o resultadoObtido é igual resultadoEsperado
		assertEquals(resultadoEsperado, resultadoObtido);
		
	}
	
	/* Se m é um inteiro não negativo 
	 * então mdc(m.a, m.b) == m.mdc(a,b);
	 */
	@Test
	void testMdc_Propriedade4(){
		
		final int valorA = 9;
		final int valorB = 3;
		final int m = 2;
		final int resultadoEsperado = MathUtil.mdc(valorA * valorB, valorB * m);
		
		//mdc(a*m, b*m) == m * mdc(a,b)
		final int resultadoObtido = m * MathUtil.mdc(valorA, valorB);
		
		//verificar se o resultadoObtido é igual resultadoEsperado
		assertEquals(resultadoEsperado, resultadoObtido);
		
	}
	
	/* Se mdc(a,b) = 1 então
	 * mdc(a.b,c) = mdc(a,c).mdc(b,c);
	 */
	@Test
	void testMdc_Propriedade5_1(){
		
		final int valorA = 7;
		final int valorB = 3;
		final int valorC = 3;
		
		final int resultadoEsperado = MathUtil.mdc(valorA * valorB, valorC);
		final int resultadoObtido = MathUtil.mdc(valorB, valorC);
		

		assertEquals(resultadoEsperado, resultadoObtido);
		
	}
	
	
	/* mdc(a,b) = mdc(b,c);
	 */
	@Test
	void testMdc_Propriedade6(){
		
		final int valorA = 7;
		final int valorB = 2;
		
		final int resultadoEsperado = MathUtil.mdc(valorA, valorB);
		final int resultadoObtido = MathUtil.mdc(valorB, valorA);
		
		assertEquals(resultadoEsperado, resultadoObtido);
		
	}
	
	@Test
	void testMdc_Propriedade7() {
		final int valorA = -12;
		final int valorB = -6;
		
		final int resultadoEsperado = 6;
		final int resultadoObtido = MathUtil.mdc(valorA, valorB);
		
		assertEquals(resultadoEsperado, resultadoObtido);



	}
	
	

}
