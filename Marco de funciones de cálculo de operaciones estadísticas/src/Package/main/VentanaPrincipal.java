package Package.main;
import javax.swing.JOptionPane;
import Package.MTC.*;
import Package.MedidasDispersion.*;
import Package.Correlacion.*;
import Package.RegresionMultifactorial.*;
import Package.Distribucion.*;
import Package.IntegracionSimpson.*;

public class VentanaPrincipal {
	static int funcion=0,Nseg=0;
	static double X1=0,X2=0,Xk=0,dof=0;
	public static void main(String[] args) {
		double conjunto1[],conjunto2[],conjunto3[],conjunto4[];
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Marco de funciones de calculo de operaciones estadisticas");
		MenuPrincipal();
		switch (funcion) {
			case 1://1.-Media Aritmética
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMTC contexto;
				contexto=new ContextoMTC(new MediaAritmetica());
				double MediaAritmetica=contexto.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "La media aritmetica es: "+MediaAritmetica); //Comprobando
				break;
			case 2://2.-Media Geométrica
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMTC contexto2;
				contexto2=new ContextoMTC(new MediaGeometrica());
				double MediaGeometrica=contexto2.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "La media Geometrica es: "+MediaGeometrica); //Comprobando
				break;
			case 3://3.-Media Armónica
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMTC contexto3;
				contexto3=new ContextoMTC(new MediaArmonica());
				double MediaArmonica=contexto3.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "La media Armonica es: "+MediaArmonica); //Comprobando
				break;
			case 4://Moda
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMTC contexto4;
				contexto4=new ContextoMTC(new Moda());
				double Moda=contexto4.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "La moda es: "+Moda); //Comprobando
				break;
			case 5://Mediana
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMTC contexto5;
				contexto5=new ContextoMTC(new Mediana());
				double Mediana=contexto5.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "La mediana: "+Mediana); //Comprobando
				break;
			case 6://"6.-Desviación Estándar\n"+
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMD contexto6;
				contexto6=new ContextoMD(new DesviacionEstandar());
				double Desviacion=contexto6.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "La Desviacion Estandar es: "+Desviacion); //Comprobando
				break;
			case 7://"7.-Varianza\n"+
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMD contexto7;
				contexto7=new ContextoMD(new Varianza());
				double Varianza=contexto7.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "La varianza es: "+Varianza); //Comprobando
				break;
			case 8://"8.-Rango\n"+
				conjunto1=new double[NumerosConjunto(1)];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				ContextoMD contexto8;
				contexto8=new ContextoMD(new Rango());
				double Rango=contexto8.procesar(conjunto1);
				JOptionPane.showMessageDialog(null, "El rango es: "+Rango); //Comprobando
				break;
			case 9://"9.-Correlación\n"+
				conjunto1=new double[NumerosConjunto(1)];
				conjunto2=new double[conjunto1.length];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				for(int i=0;i<conjunto2.length;i++) {
					conjunto2[i]=Nums(i+1,2);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				AbsCorrelacion Corr=new Correlacion();
				JOptionPane.showMessageDialog(null, "La correlacion es: "+Corr.calcular(conjunto1, conjunto2)); //Comprobando
				break;
			case 10://"10.-Distribución Normal\n"+
				X1 =Double.parseDouble(VerificaEntrada("Ingresa el valor X1:"));
				X2 =Double.parseDouble(VerificaEntrada("Ingresa el valor X2:"));
				Nseg =Integer.parseInt(VerificaEntrada("Ingresa el Numero de Segmentos"));
				AbsNormal Normal =new Normal();
				Normal.calcular(X1, X2, Nseg);
				JOptionPane.showMessageDialog(null, "La distribucion Normal es: "+Normal.calcular(X1, X2, Nseg)[0]); //Definir que mostrar en la Dist Normal
				break;
			case 11://"11.-Distribución T student\n"+
				X1 =Double.parseDouble(VerificaEntrada("Ingresa el valor Xk:"));
				dof =Double.parseDouble(VerificaEntrada("Ingresa los grados de libertad"));
				ContextoDistribucion contexto9;
				contexto9=new ContextoDistribucion(new T_student());
				double Tstudent=contexto9.procesar(X1, dof);
				JOptionPane.showMessageDialog(null, "La integral T student es: " + Tstudent); //Comprobando
				break;
			case 12://"12.-Regresión Multifactorial\n"+
				//conjunto1=new double[6];//Test
				conjunto1=new double[NumerosConjunto(1)];
				conjunto2=new double[conjunto1.length];
				conjunto3=new double[conjunto1.length];
				conjunto4=new double[conjunto1.length];
				//JOptionPane.showMessageDialog(null, "Cantidad total numeros "+ conjunto1.length); //Comprobando
				
				for(int i=0;i<conjunto1.length;i++) {
					conjunto1[i]=Nums(i+1,1);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				for(int i=0;i<conjunto1.length;i++) {
					conjunto2[i]=Nums(i+1,2);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				for(int i=0;i<conjunto1.length;i++) {
					conjunto3[i]=Nums(i+1,3);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				for(int i=0;i<conjunto1.length;i++) {
					conjunto4[i]=Nums(i+1,4);
					//JOptionPane.showMessageDialog(null, "Numero "+String.valueOf(conjunto1[i])+" guardado"); //Comprobando
				}
				double wk =Double.parseDouble(VerificaEntrada("Ingresa el valor wk"));
				double xk =Double.parseDouble(VerificaEntrada("Ingresa el valor xk"));
				double yk =Double.parseDouble(VerificaEntrada("Ingresa el valor yk"));
				
				/* // Testing
				double wk =185;
				double xk =150;
				double yk =45;
				*/
				
				AbsRegresionMultifactorial Regresion=new RegresionMultifactorial();
				JOptionPane.showMessageDialog(null, "La correlacion es: "+Regresion.calcular(conjunto1, conjunto2, conjunto3, conjunto4, xk, yk, wk)); //Comprobando
				
				break;
			case 13://"13.-Integral Simpson\n"+
				X1 =Double.parseDouble(VerificaEntrada("Ingresa el valor X1"));
				X2 =Double.parseDouble(VerificaEntrada("Ingresa el valor X2"));
				dof =Double.parseDouble(VerificaEntrada("Ingresa los grados de libertad"));
				AbsIntegralSimpson Integral = new IntegralSimpson();
				JOptionPane.showMessageDialog(null, "El valor calculado de la integral es: "+Integral.calcular(X1, X2, dof)); //Comprobando
				break;
			case 14://"14.-Distribución Chi Cuadrada\n"));
				X1 =Double.parseDouble(VerificaEntrada("Ingresa el valor Xk:"));
				dof =Double.parseDouble(VerificaEntrada("Ingresa los grados de libertad"));
				break;
			default:
				MenuPrincipal();
				break;
			
		}
		
	}
	public static String VerificaEntrada (String titulo) {
		String Entrada = "";
		Boolean VEntrada = false;
		while (VEntrada != true) {
			Entrada = JOptionPane.showInputDialog(titulo);
			VEntrada = Entrada.matches("[+-]?\\d*(\\.\\d+)?");
		}
		return Entrada;
	}
	public static void MenuPrincipal() {
		funcion=Integer.parseInt (VerificaEntrada("Selecciona la funcion de calculo a realizar:\n"+
				"1.-Media Aritmética\n"+
				"2.-Media Geométrica\n"+
				"3.-Media Armónica\n"+
				"4.-Moda\n"+
				"5.-Mediana\n"+
				"6.-Desviación Estándar\n"+
				"7.-Varianza\n"+
				"8.-Rango\n"+
				"9.-Correlación\n"+
				"10.-Distribución Normal\n"+
				"11.-Distribución T student\n"+
				"12.-Regresión Multifactorial\n"+
				"13.-Integral Simpson\n"+
				"14.-Distribución Chi Cuadrada\n"));
	}
	public static int NumerosConjunto(int X) {
		return Integer.parseInt (VerificaEntrada("Ingresa la cantidad de numeros del conjunto "+ X));
		
	}
	public static double Nums(int X, int Y) {
		return Double.parseDouble(VerificaEntrada("Ingresa el numero "+X+" del conjunto "+ Y));
	}
}
