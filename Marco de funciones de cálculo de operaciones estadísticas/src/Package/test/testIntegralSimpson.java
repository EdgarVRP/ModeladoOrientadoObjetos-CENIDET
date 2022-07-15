package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import Package.IntegracionSimpson.*;
class testIntegralSimpson {
	@Test
	public void testCorrelacion() {
		double X1 =0,X2 =1.1,dof=9;
		AbsIntegralSimpson Integral = new IntegralSimpson();
		double calculo=Integral.calcular(X1, X2, dof);
		//Truncando resultados
		String pattern = "#.####";
		DecimalFormat decimalFormat =  new DecimalFormat(pattern);
		double resultado = Double.parseDouble(decimalFormat.format(calculo));
		double esperado=0.3501;
		assertEquals(esperado,resultado);
	}
}
