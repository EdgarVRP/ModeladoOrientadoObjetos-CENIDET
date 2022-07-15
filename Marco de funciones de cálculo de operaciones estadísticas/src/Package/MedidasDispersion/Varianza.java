package Package.MedidasDispersion;
import Package.MTC.*;
public class Varianza implements MD {

	@Override
	public double Calcular(double[] Numeros) {
		// TODO Auto-generated method stub
		MTC Media =new MediaAritmetica();
		
		double MediaT=Media.calcular(Numeros);
		double Varianza=0, Temp=0;
		int Total=Numeros.length;
		for(int M=0;M<Total; M++) {
			Temp=Temp+Math.pow((Numeros[M]-MediaT),2);
		}
		Varianza=Temp/(Total-1);
		return Varianza;		
	}

}
