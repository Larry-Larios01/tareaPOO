package Si;
import java.util.*;
public class Hexaedro extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Hexaedro(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Hexaedro() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontrar el area, volumen y diagonal del hexaedro");
			System.out.println("¿Cuanto mide una arista?");
			double arista = lector.nextDouble();
			double area = 6*Math.pow(arista, 2);
			double volumen = Math.pow(arista, 3);
			double diagonal = arista*Math.sqrt(3);
			System.out.println("el area del hexaedro es " + area + " u²");
			System.out.println("la diagonal mayor del hexaedro es " + diagonal + " u");
			System.out.println("el volumen del hexaedro  es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}