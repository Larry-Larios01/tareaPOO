package Si;
import java.util.*;
public class Ortoedro extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Ortoedro(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Ortoedro () {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("bienvenido a este programa para calcular el area, volumen y diagonal del ortoedro");
			System.out.println("¿cuanto mide la base del rectangulo frontal?");
			double a = lector.nextDouble();
			System.out.println("¿cuanto mide la base del rectangulo lateral?");
			double b = lector.nextDouble();
			System.out.println("¿cuanto mide la altura?");
			double c = lector.nextDouble();
			double area = 2*(a*b+a*c+b*c);
			double diagonal = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
			double volumen = a*b*c;
			System.out.println("el area del ortoedro es " + area + " u²");
			System.out.println("el volumen del ortoedro es " + volumen + " u³");
			System.out.println("la diagonal del ortoedro es " + diagonal + " u");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}