package Package.MedidasDispersion;

public class Rango implements MD {

	@Override
	public double Calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		double maximo=Numeros[0],minimo=Numeros[0];
		for (int i = 0; i < Numeros.length; i++){
			if (maximo < Numeros[i])
				maximo = Numeros[i];
			if (minimo > Numeros[i])
				minimo = Numeros[i];
		}
		return maximo-minimo;
	}

}
