package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.MedidasDispersion.*;

class testRango {
	@Test
	public void testDesviacion() {
		double conjunto1 []= {1,2,2,3,4,8,11,13,15};
		ContextoMD contexto2;
		contexto2=new ContextoMD(new Rango());
		double calculo=contexto2.procesar(conjunto1);
		//Truncando resultados
		String pattern = "#.####";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double resultado = Double.parseDouble(decimalFormat.format(calculo));
        double esperado=14;
        System.out.print(resultado);
        assertEquals(esperado,resultado);
	}
}
