package Polimorfismo;

public class Gato extends Animal {
	private String nombre;
	
	public Gato(String especie, String nombre) {
		super(especie);
		this.nombre = nombre;
	}
	public void printMensaje() {
		super.printMensaje();
		System.out.println("Soy un gato que maulla");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}