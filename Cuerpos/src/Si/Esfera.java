package Si;
import java.util.*;
public class Esfera extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Esfera(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Esfera(){}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a mi programa para calcular: area lateral, area total y volumen del cono");
			System.out.println("introduzca el radio");
			double radio = lector.nextDouble();
			System.out.println("introduzca la altura");
			double altura = lector.nextDouble();
			double generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
			double areaLateral = Math.PI*radio*generatriz;
			double areaTotal = Math.PI*radio*(generatriz+radio);
			double volumen = Math.PI*Math.pow(radio, 2)*altura/3;
			System.out.println("el area lateral del cono es " + areaLateral + " u²");
			System.out.println("el area total del cono es " + areaTotal + " u²");
			System.out.println("el volumen del cono es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}