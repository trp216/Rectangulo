package userInterface;
import model.*;
import java.util.Scanner;

public class Main {

	private Departamento matematicas;
	
	public Main() {
		matematicas = new Departamento("Matematicas");
	}

	public static void main(String[] args) {
		Main objMain = new Main();
		objMain.calcularRM();

	}
	
	public String calcularRM() {
		Scanner r = new Scanner(System.in);
		System.out.println("Digite el valor de la base:");
		double b = r.nextDouble();
		System.out.println("Digite el valor de la altura:");
		double h = r.nextDouble();
		String message = matematicas.calcularR(b, h);
		return message;
	}

}
