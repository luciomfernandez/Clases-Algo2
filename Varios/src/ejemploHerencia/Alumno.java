package ejemploHerencia;
import java.util.ArrayList;

import algo2.Ciudad;

public class Alumno extends Persona {
	private Integer nroLu;
	private ArrayList<Materia> listaMateriasAprobadas;
	
	
	public Alumno(Integer nroLu,String nombre, Integer dni, Integer edad, Ciudad ciudadNacimiento) {
		super(nombre,dni,edad,ciudadNacimiento);
		this.nroLu=nroLu;
	}
	
	public Integer getNroLu() {
		return nroLu;
	}
	
	public void setNroLu(Integer nroLu) {
		this.nroLu = nroLu;
	}
	
	
	
	
}
