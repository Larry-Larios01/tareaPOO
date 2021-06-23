package Si;
import java.util.*;
public class Dodecaedro extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Dodecaedro(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Dodecaedro() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontrar el area, volumen de un dodecaedro, ademas del area de un pentagono");
			System.out.println("¿Cuanto mide una arista?");
			double arista = lector.nextDouble();
			double angulo = 360/5;
			double anguloAp = angulo/2;
			double tangente =  Math.tan(Math.toRadians(anguloAp));
			double apotema = arista/(2*tangente);
			double areaPentagono = 5*arista*apotema/2;
			double area = 3*Math.pow(arista, 2)*Math.sqrt(25+(10*Math.sqrt(5)));
			double volumen = (15+(7*Math.sqrt(5))*Math.pow(arista, 3))/4;
			System.out.println("el area del dodecaedro es " + area + " u²");
			System.out.println("el volumen del dodecaedro  es " + volumen + " u³");
			System.out.println("el area de un pentagono " + areaPentagono + " u²");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}