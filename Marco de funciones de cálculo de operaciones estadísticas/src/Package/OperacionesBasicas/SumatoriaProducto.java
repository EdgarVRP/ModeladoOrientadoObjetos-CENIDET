package Package.OperacionesBasicas;

public class SumatoriaProducto extends AbsSumatoriaProducto{

	@Override
	public double calcular(double[] Numeros, double[] Numeros2) {
		// TODO Auto-generated method stub
		double SUMSUM = 0;
		for (int M = 0; M < Numeros.length; M++) {
			SUMSUM = (Numeros[M] * Numeros2[M]) + SUMSUM;
		}
		return SUMSUM;
	}

}
