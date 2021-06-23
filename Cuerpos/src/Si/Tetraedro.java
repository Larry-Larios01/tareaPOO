package Si;
import java.util.*;
public class Tetraedro extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Tetraedro(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Tetraedro () {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontrar el area, volumen y altura mayor de un tetraedro");
			System.out.println("¿Cuanto mide una arista?");
			double arista = lector.nextDouble();
			double area = Math.pow(arista, 2)*Math.sqrt(3);
			double volumen = (Math.sqrt(2)/12)*Math.pow(arista, 3);
			double altura = arista*(Math.sqrt(6)/3);
			System.out.println("el area del tetraedro es " + area + " u²");
			System.out.println("la altura mayor del tetraedro es " + altura + " u");
			System.out.println("el volumen del tetraedro  es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}