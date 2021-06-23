package Si;
import java.util.*;
public class Icosaedro extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Icosaedro(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Icosaedro() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontrar el area y volumen de un icosaedro");
			System.out.println("¿Cuanto mide una arista?");
			double arista = lector.nextDouble();
			double area = 5*Math.pow(arista, 2)*Math.sqrt(3);
			double volumen = 5*(3+Math.sqrt(5))*Math.pow(arista, 3)/12;
			System.out.println("el area del icosaedro es " + area + " u²");
			System.out.println("el volumen del icosaedro  es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}