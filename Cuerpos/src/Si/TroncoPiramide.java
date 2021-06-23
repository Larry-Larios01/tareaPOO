package Si;
import java.util.*;
public class TroncoPiramide extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public TroncoPiramide(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public TroncoPiramide() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontra el area lateral, area total y volumen del tronco de piramide recta regular");
			System.out.println("¿Cuantos lados tienen las bases de la piramide?");
			int numLados = lector.nextInt();
			System.out.println("¿Cuanto mide uno de los lados de la base menor?");
			double ladoBmn = lector.nextDouble();
			System.out.println("¿Cuanto mide uno de los lados de la base mayor?");
			double ladoBmy = lector.nextDouble();
			System.out.println("¿Cuanto mide la altura?");
			double altura = lector.nextDouble();
			double perimetroMy = numLados*ladoBmy;
			double perimetroMn = numLados*ladoBmn;
			double angulo = 360/numLados;
			double anguloAp = angulo/2;
			double tangente =  Math.tan(Math.toRadians(anguloAp));
			double apotemaMn = ladoBmn/(2*tangente);
			double apotemaMy = ladoBmy/(2*tangente);
			double apotemaTronco = Math.sqrt(Math.pow(altura, 2)-(Math.pow(apotemaMy, 2)-Math.pow(apotemaMn, 2)));
			double areaLateral = (perimetroMy+perimetroMn/2)*apotemaTronco;
			double areaMy = perimetroMy*apotemaMy/2;
			double areaMn = perimetroMn*apotemaMn/2;
			double areaTotal = areaLateral+areaMy+areaMn;
			double volumen = altura*(areaMy+areaMn+Math.sqrt(areaMy*areaMn));
			System.out.println("el area lateral del troco de piramide es " + areaLateral + " u²");
			System.out.println("el area total del tronco de piramide es " + areaTotal + " u²");
			System.out.println("el volumen del tronco de piramide es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}