package Package.MTC;

public class MediaGeometrica implements MTC {

	@Override
	public double calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		double MediaGeo = 1;
		int Total = Numeros.length;
		for (int M = 0; M < Total; M++) {
			MediaGeo = Numeros[M] * MediaGeo;
		}
		MediaGeo =Math.pow(MediaGeo, (double) 1 / Total);
		return MediaGeo;
	}

}
