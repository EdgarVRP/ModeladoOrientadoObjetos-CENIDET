package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;

import Package.RegresionMultifactorial.AbsRegresionMultifactorial;
import Package.RegresionMultifactorial.RegresionMultifactorial;
class testRegresionMultiple {
	@Test
	public void testCorrelacion() {
		double conjunto1 []= {345,168,94,187,621,255};
		double conjunto2 []= {65,18,0,185,87,0};
		double conjunto3 []= {23,18,0,98,10,0};
		double conjunto4 []= {31.4,14.6,6.4,28.3,42.1,15.3};
		double wk =185;
		double xk =150;
		double yk =45;
		AbsRegresionMultifactorial Regresion=new RegresionMultifactorial();
		String resultado=Regresion.calcular(conjunto1, conjunto2, conjunto3, conjunto4, xk, yk, wk);
		System.out.print(resultado);
		String esperado="El resultado es: Beta 0 es: 0.5664574696019429Beta 1 es: 0.06532925469423313Beta 2 es: 0.00871873619457772Beta 3 es: 0.151048647610362 La proyeccion Zk es: 21.06252492649824";
		assertEquals(esperado,resultado);
	}

}
