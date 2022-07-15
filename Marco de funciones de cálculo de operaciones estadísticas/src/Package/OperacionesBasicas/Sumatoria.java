package Package.OperacionesBasicas;

public class Sumatoria extends AbsSumatoria{
	@Override
	public double calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		double SUM = 0;
		for (int M = 0; M < Numeros.length; M++) {
			SUM = Numeros[M] + SUM;
		}
		return SUM;
	}

}
