package Package.MedidasDispersion;

public class DesviacionEstandar implements MD {

	@Override
	public double Calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		MD varianza=new Varianza();
		double Desviacion=Math.sqrt(varianza.Calcular(Numeros));
		return Desviacion;
	}

}
