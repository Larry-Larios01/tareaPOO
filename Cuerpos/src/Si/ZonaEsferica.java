package Si;
import java.util.*;
public class ZonaEsferica extends Cuerpos {
	static Scanner lector = new Scanner(System.in);
	public ZonaEsferica(double radio, double altura,  double generatriz, double apotema, double apotemaMayor, int lados) {
		super(radio, altura, generatriz, apotemaMayor, apotemaMayor, lados);
	}
	public ZonaEsferica() {}
	@Override
	public void CalcularCuerpo(){
		try{
			System.out.println("Bienvenido a mi programa para calcular: area y volumen del casquete y zona esferica");
			System.out.println("introduzca el radio menor");
			double radioMenor = lector.nextDouble();
			System.out.println("introduzca el radio menor primo");
			double radioPrimo = lector.nextDouble();
			System.out.println("introduzca el radio mayor");
			double radioMayor = lector.nextDouble();
			System.out.println("ingrese la altura ");
			double altura = lector.nextDouble();
			double areaZona = 2*Math.PI*radioMayor*altura;
			double volumenZona = Math.PI*altura*((Math.pow(altura, 2) + 3* Math.pow(radioMenor, 2) + 3* Math.pow(radioPrimo, 2))/6);
			double volumenCasquete = Math.PI*Math.pow(altura, 2)*(3*radioMayor-altura)/3;
			System.out.println("el area de la zona esferica es " + areaZona + " u²");
			System.out.println("el volumen de la zona esferica es " + volumenZona + " u³");
			System.out.println("el area del casquete esferico es " + areaZona + " u²");
			System.out.println("el volumen del casquete esferico es " + volumenCasquete + " u³");
			 }
			catch (java.util.InputMismatchException e){
			  System.out.println("no se puede calcular con ese dato");
			 }
	}
}