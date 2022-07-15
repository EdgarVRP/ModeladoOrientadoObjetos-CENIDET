package Package.Distribucion;

public class ContextoDistribucion {
	private Distribucion strategy;

	public ContextoDistribucion(Distribucion strategy) {
		this.strategy = strategy;
	}
	public double procesar(double dof, double Xk) {
        return strategy.calcular(dof, Xk);
   }
   
}
