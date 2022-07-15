package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.Correlacion.*;

class testCorrelacion {
	@Test
	public void testCorrelacion() {
		double conjunto []= {186,699,132,272,291,331,199,1890,788,1601};
		double conjunto2 []= {15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
		AbsCorrelacion Corr=new Correlacion();
		double correlacion=Corr.calcular(conjunto,conjunto2);
		//Truncando resultados
		String pattern = "#.##";
		DecimalFormat decimalFormat =  new DecimalFormat(pattern);
		double resultado = Double.parseDouble(decimalFormat.format(correlacion));
		double esperado=0.95;
		assertEquals(esperado,resultado);
	}

}
