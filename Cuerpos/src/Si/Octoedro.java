package Si;
import java.util.*;
public class Octoedro extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Octoedro(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Octoedro() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontrar el area y volumen del octoedro");
			System.out.println("¿Cuanto mide una arista?");
			double arista = lector.nextDouble();
			double area = 2*Math.pow(arista, 2)*Math.sqrt(3);
			double volumen = (Math.sqrt(2)/3)*Math.pow(arista, 3);
			System.out.println("el area del octaedro es " + area + " u²");
			System.out.println("el volumen del octaedro  es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}
