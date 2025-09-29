package ar.edu.unlp.info.oo1.ejercicio10;

public class main {

	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		
		Gerente alan2 = new Gerente("Alan2 Turing2");
		double sueldoBasicoDeAlan = alan2.sueldoBasico();
		
		System.out.println(aportesDeAlan);
		System.out.println(sueldoBasicoDeAlan);
		
	}

}
