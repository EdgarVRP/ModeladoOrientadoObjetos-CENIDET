package Package.OperacionesBasicas;

public class FuncionGamma extends AbsFuncionGamma {

	@Override
	public double calcular(double dof) {
		// TODO Auto-generated method stub
		double Gamma=dof-1;
		if(Gamma==0&&dof<2) {
			Gamma=1;
		}
		if(Gamma==1&&dof<2) {
			Gamma=2;
		}
		if(Gamma==.5&&dof<2) {
			Gamma=Math.sqrt(Math.PI);
		}
		
		for(int a=2;a<dof;a++) {
			if((dof-a)==.5) {
				Gamma=Math.sqrt(Math.PI)*Gamma*.5;	
			}else {
				Gamma=(dof-a)*Gamma;
			}
		}
		return Gamma;
	}
	
}
