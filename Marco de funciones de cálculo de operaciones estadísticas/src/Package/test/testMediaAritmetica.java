package Package.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Package.MTC.ContextoMTC;
import Package.MTC.MediaAritmetica;

class testMediaAritmetica {

	@Test
	public void testMediaAritmetica() {
		double conjunto1 []= {21.3,38.4,12.7,41.6};
		ContextoMTC contexto;
		contexto=new ContextoMTC(new MediaAritmetica());
		double MediaAritmetica=contexto.procesar(conjunto1);
		assertEquals(28.5,MediaAritmetica);
	}
}
