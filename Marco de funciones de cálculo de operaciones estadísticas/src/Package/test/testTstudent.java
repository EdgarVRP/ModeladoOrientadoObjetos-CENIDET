package Package.test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import Package.Distribucion.*;

class testTstudent {
	public void testDesviacion() {
		double X1=5,dof=9;
		ContextoDistribucion contexto9;
		contexto9=new ContextoDistribucion(new T_student());
		double calculo=contexto9.procesar(X1, dof);
		//Truncando resultados
		String pattern = "#.####";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double resultado = Double.parseDouble(decimalFormat.format(calculo));
        double esperado=.0005;
        System.out.print(resultado);
        assertEquals(esperado,resultado);
	}
}
