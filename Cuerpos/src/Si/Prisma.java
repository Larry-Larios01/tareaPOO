package Si;
import java.util.*;
public class Prisma extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Prisma(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Prisma () {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontra el area lateral, area total y volumen del prisma");
			System.out.println("¿Cuantos lados tiene la base del prisma?");
			int numLados = lector.nextInt();
			System.out.println("¿cuanto mide un  lado de la base?");
			double lado = lector.nextDouble();
			System.out.println("¿cuanto mide la altura?");
			double altura = lector.nextDouble();
			double aLateral = (numLados*lado)*altura;
			double perimetro = lado*numLados;
			double angulo = 360/numLados;
			double anguloAp = angulo/2;
			double tangente =  Math.tan(Math.toRadians(anguloAp));
			double apotema = lado/(2*tangente);
			double aBase = perimetro*apotema/2;                 
			double areaTotal = aLateral + (2*aBase);
			double volumen = aBase * altura;
			System.out.println("el area lateral del prisma es " + aLateral + " u²");
			System.out.println("el area total del prisma es " + areaTotal + " u²");
			System.out.println("el volumen del prisma es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}