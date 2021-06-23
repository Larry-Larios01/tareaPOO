package Si;
import java.util.*;
public class TroncoCono extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public TroncoCono(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public TroncoCono() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a mi programa para calcular: area lateral, area total y volumen del troco de un cono");
			System.out.println("introduzca el radio menor");
			double radioMenor = lector.nextDouble();
			System.out.println("introduzca el radio mayor");
			double radioMayor = lector.nextDouble();
			System.out.println("introduzca la altura");
			double altura = lector.nextDouble();
			double generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(radioMayor - radioMenor, 2));
			double areaLateral = Math.PI*generatriz*(radioMayor+radioMenor);
			double areaBg = Math.PI*Math.pow(radioMayor, 2);
			double areaBp = Math.PI*Math.pow(radioMenor, 2);
			double areaTotal = areaLateral+areaBg+areaBp;
			double volumen = Math.PI*altura*(Math.pow(radioMayor, 2)+Math.pow(radioMenor, 2)+(radioMayor*radioMenor))/3;
			System.out.println("el area lateral del troco de cono es " + areaLateral + " u²");
			System.out.println("el area total del tronco cono es " + areaTotal + " u²");
			System.out.println("el volumen del tronco de cono es " + volumen + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}
