package Package.IntegracionSimpson;
import Package.Distribucion.*;
public class IntegralSimpson extends AbsIntegralSimpson{

	@Override
	public double calcular(double X1, double X2, double dof) {
		// TODO Auto-generated method stub
		AbsNormal Distribucion =new Normal();
		double DistribucionT[]=Distribucion.calcular(X1, X2, 100);
		Distribucion Fx = new T_student();
		double Integral=Fx.calcular(dof, X1);//Verificar X1=0????
		int NumSeg=100;
		for(int a=1;a<=NumSeg;a+=2) {
			Integral=Integral+(4*Fx.calcular(dof, DistribucionT[a]));
			//System.out.println(a*Avance);
			//System.out.println(4*Fx(DistribucionT[a])*Avance/3);
		}
		for(int a=2;a<NumSeg;a+=2) {
			Integral=Integral+(2*Fx.calcular(dof, DistribucionT[a]));
			//System.out.println(a*Avance);
			//System.out.println(2*Fx(DistribucionT[a])*Avance/3);
		}
		Integral=Integral+Fx.calcular(dof, DistribucionT[NumSeg]);
		double Avance=(X2-X1)/NumSeg;
		Integral=Integral*Avance/3;
		//System.out.println(Fx(DistribucionT[NumSeg])*Avance/3);
		return Integral;
	}
	
}
