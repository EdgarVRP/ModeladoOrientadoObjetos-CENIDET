package Package.MTC;

public class Mediana implements MTC {

	@Override
	public double calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		double Mediana=0;
		int Centro=Numeros.length/2;
		if(Numeros.length%2==1) {
			Mediana=Numeros[Centro];
			return Mediana;
		} else {
			return (Numeros[Centro-1]+Numeros[Centro])/2;

		}
	}
	
}
