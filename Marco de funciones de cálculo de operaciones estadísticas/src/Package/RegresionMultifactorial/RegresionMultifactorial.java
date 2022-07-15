package Package.RegresionMultifactorial;
import Package.OperacionesBasicas.AbsSumatoria;
import Package.OperacionesBasicas.AbsSumatoriaProducto;
import Package.OperacionesBasicas.Sumatoria;
import Package.OperacionesBasicas.SumatoriaProducto;

public class RegresionMultifactorial extends AbsRegresionMultifactorial {
	double[][] MatrizGauss = new double[4][4];
	double r[]=new double[4];
	double Betas[]=new double[4];
	double Zk;

	@Override
	public String calcular(double[] Numeros, double[] Numeros2, double[] Numeros3, double[] Numeros4, double xk,
			double yk, double wk) {
		// TODO Auto-generated method stub
		MatrizGauss(Numeros, Numeros2, Numeros3, Numeros4);
		System.out.println(Numeros[0]);
		System.out.println(Numeros2[1]);
		System.out.println(Numeros3[2]);
		System.out.println(Numeros4[3]);
		System.out.println(Numeros[4]);
		System.out.println(Numeros[5]);
		System.out.println(Numeros2[0]);
		System.out.println(Numeros2[1]);
		System.out.println(Betas[0]);
		Gauss();
		System.out.println(Betas[0]);
		PrediccionY(xk,yk,wk);
		System.out.println(Betas[0]);
		return toString();
	}

	public void MatrizGauss(double[] Numeros, double[] Numeros2, double[] Numeros3, double[] Numeros4) {
		int N = Numeros.length;
		AbsSumatoria Sumatoria = new Sumatoria();
		AbsSumatoriaProducto SumatoriaPrducto = new SumatoriaProducto();
		MatrizGauss[0][0] = N;
		
		MatrizGauss[0][1] = Sumatoria.calcular(Numeros);
		MatrizGauss[0][2] = Sumatoria.calcular(Numeros2);
		MatrizGauss[0][3] = Sumatoria.calcular(Numeros3);
		r[0] = Sumatoria.calcular(Numeros4);
		MatrizGauss[1][0] = Sumatoria.calcular(Numeros);
		MatrizGauss[1][1] = SumatoriaPrducto.calcular(Numeros, Numeros);
		MatrizGauss[1][2] = SumatoriaPrducto.calcular(Numeros, Numeros2);
		MatrizGauss[1][3] = SumatoriaPrducto.calcular(Numeros, Numeros3);
		r[1] = SumatoriaPrducto.calcular(Numeros, Numeros4);
		MatrizGauss[2][0] = Sumatoria.calcular(Numeros2);
		MatrizGauss[2][1] = SumatoriaPrducto.calcular(Numeros, Numeros2);
		MatrizGauss[2][2] = SumatoriaPrducto.calcular(Numeros2, Numeros2);
		MatrizGauss[2][3] = SumatoriaPrducto.calcular(Numeros2, Numeros3);
		r[2] = SumatoriaPrducto.calcular(Numeros2, Numeros4);
		MatrizGauss[3][0] = Sumatoria.calcular(Numeros3);
		MatrizGauss[3][1] = SumatoriaPrducto.calcular(Numeros, Numeros3);
		MatrizGauss[3][2] = SumatoriaPrducto.calcular(Numeros2, Numeros3);
		MatrizGauss[3][3] = SumatoriaPrducto.calcular(Numeros3, Numeros3);
		r[3] = SumatoriaPrducto.calcular(Numeros3, Numeros4);
		//
	}

	public void Gauss() {
		int n = 4, i = 0, j = 0, s = 0;
		double d = 0;
		for (i = 0; i < n; i++) {
			for (j = i; j < n; j++) {
				if (i == j) {
					d = MatrizGauss[i][j];
					for (s = 0; s < n; s++) {
						MatrizGauss[i][s] = ((MatrizGauss[i][s]) / d);
					}
					r[i] = ((r[i]) / d);
				} else {
					d = MatrizGauss[j][i];
					for (s = 0; s < n; s++) {
						MatrizGauss[j][s] = MatrizGauss[j][s] - (d * MatrizGauss[i][s]);
					}
					r[j] = r[j] - (d * r[i]);
				}
			}
		}
		for (i = n - 1; i >= 0; i--) {
			double y = r[i];
			for (j = n - 1; j >= i; j--) {
				y = y - Betas[j] * MatrizGauss[i][j];
			}
			Betas[i] = y;
		}
	}


	public  void PrediccionY(double xk, double yk, double wk) {
		 Zk = Betas[0] + Betas[1] * wk + Betas[2] * wk + Betas[3] * yk;
	}
	// Devolviendo el estado del objeto
		public String toString() {
			String Resultado = "El resultado es: ";
			for (int a = 0; a < 4; a++) {
				Resultado +=("Beta " + a + " es: " + Betas[a]);
			}
			Resultado += (" La proyeccion Zk es: "+ Zk);
			return Resultado;
		}
}
