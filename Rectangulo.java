package model;

public class Rectangulo {

	private double base;
	private double altura;
	
	public Rectangulo(double b, double h) {
		base = b;
		altura = h;
	}

	public double area(double b, double h) {
		double a = b*h;
		return a;
	}
	
	public double perimetro(double b, double h) {
		double p = (b*2) + (h*2);
		return p;
	}
	
	public double diagonal(double b, double h) {
		double d = Math.sqrt((b*b) + (h*h));
		return d;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
