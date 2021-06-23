package Si;

public class Cuerpos {
	private double radio;
	private double altura;
	private double aLateral;
	private double aTotal;
	private double volumen;
	private double generatriz;
	private double apotema;
	private double apotemaMayor;
	private int lados;
	
	public Cuerpos(double radio, double altura, double generatriz, double apotema, double apotemaMayor, int lados) {
		this.radio=radio;
		this.altura=altura;
		this.generatriz=generatriz;
		this.apotema=apotema;
		this.apotemaMayor=apotemaMayor;
		this.lados=lados;
	}
	public Cuerpos() {}
	
	
	
	
	public int getLados() {
		return lados;
	}




	public void setLados(int lados) {
		this.lados = lados;
	}




	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getaLateral() {
		return aLateral;
	}


	public void setaLateral(double aLateral) {
		this.aLateral = aLateral;
	}


	public double getaTotal() {
		return aTotal;
	}


	public void setaTotal(double aTotal) {
		this.aTotal = aTotal;
	}


	public double getVolumen() {
		return volumen;
	}


	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}


	public double getGeneratriz() {
		return generatriz;
	}


	public void setGeneratriz(double generatriz) {
		this.generatriz = generatriz;
	}


	public double getApotema() {
		return apotema;
	}


	public void setApotema(double apotema) {
		this.apotema = apotema;
	}


	public double getApotemaMayor() {
		return apotemaMayor;
	}


	public void setApotemaMayor(double apotemaMayor) {
		this.apotemaMayor = apotemaMayor;
	}
	public void CalcularCuerpo() {
		System.out.println("calcualando cuerpo");
	}


	

}
