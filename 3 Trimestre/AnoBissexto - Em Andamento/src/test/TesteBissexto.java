package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import models.Valores;
import principal.AnoBissexto;
public class TesteBissexto {

	@Test
	public void testaAnoBissexto() {
		
		Valores val = new Valores();
		AnoBissexto ano = new AnoBissexto();
		int resultadoEsperado = 0;
		int resultadoObtido = val.getResultadoObtido();
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	@Test
	public void testaAnoNaoBissexto() {
		Valores val = new Valores();
		AnoBissexto ano = new AnoBissexto();
		int resultadoEsperado = 1;
		int resultadoObtido = val.getResultadoObtido();
		assertFalse(resultadoEsperado, resultadoObtido);
	}

}
