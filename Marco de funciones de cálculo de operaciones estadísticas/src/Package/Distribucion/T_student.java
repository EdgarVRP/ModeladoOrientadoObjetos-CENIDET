package Package.Distribucion;
import Package.OperacionesBasicas.*;

public class T_student extends Distribucion{

	@Override
	public double calcular(double dof, double Xk) {
		
		double Fx = 0;
		Fx = 1 + (Math.pow(Xk, 2) / dof);
		Fx = Math.pow(Fx, -((dof + 1) / 2));
		AbsFuncionGamma FuncionGamma=new FuncionGamma();
		Fx = Fx * FuncionGamma.calcular((dof + 1) / 2) / ((Math.pow(dof * Math.PI, .5)) * FuncionGamma.calcular(dof / 2));
		return Fx;
		// TODO Auto-generated method stub
	}
	
}
