package Si;
import java.util.*;
public class HusoEsferico extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public HusoEsferico(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public HusoEsferico() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a este programa para encontra el area y volumen del huso esferico");
			System.out.println("¿cuanto mide el radio de la esfera?");
			double radio = lector.nextDouble();
			System.out.println("¿cuanto mide el angulo?");
			double angulo = lector.nextDouble();
			double area = 4*Math.PI*Math.pow(radio, 2)*angulo/360;
			double volumen = 4*Math.PI*Math.pow(radio, 3)*angulo/1080;
			System.out.println("el area del huso esferico es " + area + " u²");
			System.out.println("el volumen del huso esferico es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}