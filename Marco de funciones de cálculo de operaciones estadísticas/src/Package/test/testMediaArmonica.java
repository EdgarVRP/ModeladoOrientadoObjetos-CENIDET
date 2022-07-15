package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.MTC.*;
class testMediaArmonica {
	@Test
	public void testMediaArmonica() {
		double conjunto1 []= {15,17,14,13,12};
		ContextoMTC contexto2;
		contexto2=new ContextoMTC(new MediaArmonica());
		double calculo=contexto2.procesar(conjunto1);
		//Truncando resultados
		String pattern = "#.####";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double resultado = Double.parseDouble(decimalFormat.format(calculo));
        double esperado=13.9987;
        System.out.print(resultado);
        assertEquals(esperado,resultado);
	}
}
