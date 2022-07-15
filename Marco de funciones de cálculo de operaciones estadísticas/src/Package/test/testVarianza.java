package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.MedidasDispersion.*;

class testVarianza {
	@Test
	public void testDesviacion() {
		double conjunto1 []= {21.3, 38.4, 12.7, 41.6 };
		ContextoMD contexto2;
		contexto2=new ContextoMD(new Varianza());
		double calculo=contexto2.procesar(conjunto1);
		//Truncando resultados
		String pattern = "#.####";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double resultado = Double.parseDouble(decimalFormat.format(calculo));
        double esperado=190.3667;
        System.out.print(resultado);
        assertEquals(esperado,resultado);
	}
}
