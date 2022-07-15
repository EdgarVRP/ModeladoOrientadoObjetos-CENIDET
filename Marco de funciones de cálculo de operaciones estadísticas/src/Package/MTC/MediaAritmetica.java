package Package.MTC;

public class MediaAritmetica implements MTC {

	@Override
	public double calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		double Media = 0;
		int Total = Numeros.length;
		for (int M = 0; M < Total; M++) {
			Media = Numeros[M] + Media;
		}
		Media = Media / Total;
		return Media;
	}
	

}
