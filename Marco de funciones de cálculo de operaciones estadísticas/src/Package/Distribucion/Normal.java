package Package.Distribucion;

public class Normal extends AbsNormal{
	double DistribucionT[];
	@Override
	public double[] calcular(double X1, double X2, int NSegmntos) {
		// TODO Auto-generated method stub
		DistribucionT = new double[NSegmntos + 1];
		double Avance = (X2 - X1) / NSegmntos;
		for (int a = 0; a <= NSegmntos; a++) {
			DistribucionT[a] = X1 + (a * Avance);
			// System.out.println(DistribucionT[a]);
	}
		return DistribucionT;	
	}
}
