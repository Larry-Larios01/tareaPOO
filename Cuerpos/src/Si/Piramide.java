package Si;
import java.util.*;
public class Piramide extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Piramide(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Piramide() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontra el area lateral, area total y volumen de una piramide recta regular");
			System.out.println("¿Cuantos lados tiene la base de la piramide?");
			int numLados = lector.nextInt();
			System.out.println("¿cuanto mide un  lado de la base?");
			double lado = lector.nextDouble();
			System.out.println("¿cuanto mide la altura?");
			double altura = lector.nextDouble();
			double perimetro = lado*numLados;
			double angulo = 360/numLados;
			double anguloAp = angulo/2;
			double tangente =  Math.tan(Math.toRadians(anguloAp));
			double apotema = lado/(2*tangente);
			double apotemaPiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotema, 2));
			double aLateral = perimetro*apotemaPiramide/2;
			double aBase = perimetro*apotema/2;                 
			double areaTotal = aLateral + aBase;
			double volumen = aBase*altura/3;
			System.out.println("el area lateral de la piramide es " + aLateral + " u²");
			System.out.println("el area total de la piramide es " + areaTotal + " u²");
			System.out.println("el volumen de la piramide es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}