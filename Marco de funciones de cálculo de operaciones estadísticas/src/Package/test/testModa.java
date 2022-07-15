package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.MTC.*;
class testModa {
	@Test
	public void testModa() {
		double conjunto1 []= {1,2,2,3,4,8,11,13,15};
		ContextoMTC contexto2;
		contexto2=new ContextoMTC(new Moda());
		double calculo=contexto2.procesar(conjunto1);
		//Truncando resultados
		String pattern = "#.####";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double resultado = Double.parseDouble(decimalFormat.format(calculo));
        double esperado=2;
        System.out.print(resultado);
        assertEquals(esperado,resultado);
	}
}
