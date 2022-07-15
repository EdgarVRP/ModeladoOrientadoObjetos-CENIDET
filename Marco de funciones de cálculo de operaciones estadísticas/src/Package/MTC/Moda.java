package Package.MTC;

public class Moda implements MTC {

	@Override
	public double calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		double Moda = 0;
		int MaxRep=0;
		for(int M=0;M<Numeros.length; M++) {
			int Rep=0;
			for(int N=0;N<Numeros.length;N++) {
				if(Numeros[M]==Numeros[N]) {
					Rep++;
				}
				if(Rep>MaxRep) {
				Moda=Numeros[M];
				MaxRep=Rep;
				}
			}
		}
		if (MaxRep>1) {
			return Moda;
		}else {
			return 0;
		}
		
	}

}
