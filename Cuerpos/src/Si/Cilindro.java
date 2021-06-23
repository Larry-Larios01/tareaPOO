package Si;
import java.util.*;
public class Cilindro extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public Cilindro(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public Cilindro() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a mi programa para calcular: area lateral, area total y volumen del cilindro");
			System.out.println("introduzca el radio");
			double radio = lector.nextDouble();
			System.out.println("introduzca la altura");
			double altura = lector.nextDouble();
			double areaLateral = 2*Math.PI*radio*altura;
			double areaTotal = 2*Math.PI*radio*(altura+radio); 
			double volumen = Math.PI*(radio*radio)*altura;
			System.out.println("el area lateral del cilindro es " + areaLateral + " u²");
			System.out.println("el area total del cilindro es " + areaTotal + " u²");
			System.out.println("el volumen del cilindro es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}
