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
		// yagua.maullar();
		
		System.out.println("-----Liskov---");
		
		// Principio Liskov
		Jaguar yagua2 = new Jaguar(10, 120f);
		yagua2.cazar();
		
		
		System.out.println("----Inmersión de dependencias----");
		IFelino yagua3 = new Jaguar(10, 120f);
		yagua3.cazar();
		
		
		/* 	El principio de liskov se rompe, ya que el 
			principio nos dice que es posible utilizar una clase
			padre, y poder ejecutar todos métodos de dicha clase padre.
		 	
		 	Siempre que heredemos de otra clase, también se hereda el comportamiento,
		 	el comportamiento no puede ser modificado en cada herencia. Se debe de
		 	mantener
		*/
		 
		
		IFelinoSalvaje yagua4 = new Jaguar(10, 120f);
		yagua4.cazar();
		

	}

}
