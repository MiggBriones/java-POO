package main;

public class Main {

	public static void main(String[] args) {
		
		//Instanciamos la clase Jaguar
		Jaguar yagua = new Jaguar(10, 120f);
		System.out.println(yagua);
		
		
		Jaguar jaguar2 = new Jaguar();
		System.out.println(jaguar2);
		
		Jaguar jaguar3 = new Jaguar(15);
		System.out.println(jaguar3);
		
		yagua.dormir();
		yagua.comer();
		
		
		yagua.cazar();
		yagua.rugir();
		yagua.maullar();
	}

}
