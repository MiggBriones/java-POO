package main;

public class Jaguar {
	
	private int edad;
	private float peso;
	
	public Jaguar(int edad, float peso) {
		this.setPeso(edad);
		this.setPeso(peso);
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		// se pueden agregar otras acciones
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Mi edad es " + this.getEdad() + ", mi peso es " + this.getPeso();
	}
	

}
