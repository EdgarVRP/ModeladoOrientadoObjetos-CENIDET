package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.MTC.*;

class testMediaGeometrica {
	@Test
	public void  testMediaGeometrica() {
		double conjunto1 []= {2,3,14};
		ContextoMTC contexto2;
		contexto2=new ContextoMTC(new MediaGeometrica());
		double MediaGeometrica=contexto2.procesar(conjunto1);
		//Truncando resultados
		String pattern = "#.##";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double resultado = Double.parseDouble(decimalFormat.format(MediaGeometrica));
        double esperado=4.38;
        assertEquals(esperado,resultado);
	}
}
