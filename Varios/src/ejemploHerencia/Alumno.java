package ejemploHerencia;
import java.util.ArrayList;

import algo2.Ciudad;

public class Alumno extends Persona {
	private Integer nroLu;
	private ArrayList<Materia> listaMateriasAprobadas;
	
	public Alumno() {
		
	}
	
	public Alumno(Integer nroLu, ArrayList<Materia> materias,String nombre, Integer dni, Integer edad, Ciudad ciudadNacimiento) {
		super(nombre,dni,edad,ciudadNacimiento);
		listaMateriasAprobadas=materias;
		this.nroLu=nroLu;
	}
	
	public Integer getNroLu() {
		return nroLu;
	}
	
	public void setNroLu(Integer nroLu) {
		this.nroLu = nroLu;
	}
	
	
	public void printQuienSoy() {
		System.out.println("Soy la clase Alumno");
	}


	
	public Boolean esJoven() {
		return listaMateriasAprobadas.size()>2;
	}
	
}
