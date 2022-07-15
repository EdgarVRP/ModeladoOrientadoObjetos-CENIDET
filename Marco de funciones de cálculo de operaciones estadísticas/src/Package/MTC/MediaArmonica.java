package Package.MTC;

public class MediaArmonica implements MTC {

	@Override
	public double calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		double MediaArm = 0;
		int Total = Numeros.length;
		for (int M = 0; M < Total; M++) {
			MediaArm = (1/Numeros[M] )+ MediaArm;
		}
		
		MediaArm =Total/MediaArm;
		return MediaArm;
	}

}
