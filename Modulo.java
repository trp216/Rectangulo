package model;

public class Modulo {

	private String name;
	
	public Modulo(String n) {
		name = n;
	}
	
	public String calcularRMO(double b, double h) {
		Rectangulo r = new Rectangulo(b, h);
		String msg = "El area es " + r.area(b, h) + ", el perimetro es " + r.perimetro(b, h) + (", el valor de la diagonal es " + r.diagonal(b, h));
		return msg;
	}

	public String getNameM() {
		return name;
	}

	public void setNameM(String name) {
		this.name = name;
	}

}
