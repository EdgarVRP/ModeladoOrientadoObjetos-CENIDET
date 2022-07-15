package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.MedidasDispersion.*;
class testDesviacion {
	@Test
	public void testDesviacion() {
		double conjunto1 []= {1, 2, -2, 4, -3};
		ContextoMD contexto2;
		contexto2=new ContextoMD(new DesviacionEstandar());
		double calculo=contexto2.procesar(conjunto1);
		//Truncando resultados
		String pattern = "#.####";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double resultado = Double.parseDouble(decimalFormat.format(calculo));
        double esperado=2.881;
        System.out.print(resultado);
        assertEquals(esperado,resultado);
	}
}
