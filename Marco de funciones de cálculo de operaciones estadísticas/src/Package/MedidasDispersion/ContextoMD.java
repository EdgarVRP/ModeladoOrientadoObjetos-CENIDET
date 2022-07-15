package Package.MedidasDispersion;

public class ContextoMD {
	private MD strategy;

	public ContextoMD(MD strategy) {
		//super();
		this.strategy = strategy;
	}
	public double procesar(double[] Numeros) {
        return strategy.Calcular(Numeros);
   }
}
