package model;

public class Departamento {

	private String name;
	private Modulo geombasic;
	
	public Departamento(String n) {
		name = n;
		geombasic = new Modulo("Geometria basica");
	}
	
	public String getNameD() {
		return name;
	}

	public void setNameD(String name) {
		this.name = name;
	}

	public Modulo getGeombasic() {
		return geombasic;
	}

	public void setGeombasic(Modulo geombasic) {
		this.geombasic = geombasic;
	}

	public String calcularR(double b, double h) {
		String msg = geombasic.calcularRMO(b, h);
		return msg;
	}

}
