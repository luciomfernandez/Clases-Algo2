package ejemploHerencia;
import java.util.ArrayList;

import algo2.Ciudad;

public class Docente extends Persona {
	private String nombreCargo;
	
	
	public Docente() {
		
	}
	
	public Docente(String cargo,String nombre, Integer dni, Integer edad, Ciudad ciudadNacimiento) {
		super(nombre,dni,edad,ciudadNacimiento);
		this. nombreCargo=cargo;
	}
	
	public String getCargo() {
		return  nombreCargo;
	}
	

	
	public void printQuienSoy() {
		System.out.println("Soy la clase Docente");
	}
	
}
