package Package.Correlacion;
import Package.OperacionesBasicas.*;

public class Correlacion extends AbsCorrelacion{
	@Override
	public double calcular(double[] Numeros, double[] Numeros2) {
		// TODO Auto-generated method stub
		AbsSumatoria Sumatoria=new Sumatoria();
		double SUMX = Sumatoria.calcular(Numeros);
		double SUMY =Sumatoria.calcular(Numeros2);
		AbsSumatoriaProducto SumatoriaPrducto=new SumatoriaProducto();
		double SUMXX = SumatoriaPrducto.calcular(Numeros, Numeros);
		double SUMXY = SumatoriaPrducto.calcular(Numeros, Numeros2);
		double SUMYY = SumatoriaPrducto.calcular(Numeros2, Numeros2);
		int n = Numeros.length;
		double sum1 = (n * SUMYY) - (SUMY * SUMY);
		double sum2 = (n * SUMXX) - (SUMX * SUMX);
		double sum3 = Math.sqrt(sum1 * sum2);		
		return ((n * SUMXY) - (SUMX * SUMY)) / sum3;
	}
	
}
