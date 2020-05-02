package main;

public class Main {

	public static void main(String[] args) {
		
		//Instanciamos la clase Jaguar
		Jaguar yagua = new Jaguar(10, 120f);
		
		System.out.println(yagua);
		
		yagua.dormir();
		yagua.comer();
		
	}

}
