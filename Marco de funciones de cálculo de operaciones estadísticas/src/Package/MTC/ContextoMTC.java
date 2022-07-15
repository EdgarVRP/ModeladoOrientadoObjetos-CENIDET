package Package.MTC;

public class ContextoMTC {
	private MTC strategy;

	public ContextoMTC(MTC strategy) {
		//super();
		this.strategy = strategy;
	}
	public double procesar(double[] Numeros) {
         return strategy.calcular(Numeros);
    }
}
