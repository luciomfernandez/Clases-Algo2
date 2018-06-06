import algo2.Ciudad;
import ejemploHerencia.Persona;

public class Administrativo extends Persona  {
	private Integer cantPapeles;
	
	public Administrativo(Integer cantPapeles,String nombre, Integer dni, Integer edad, Ciudad ciudadNacimiento) {
		super(nombre,dni,edad,ciudadNacimiento);
		this.cantPapeles=cantPapeles;
	}
	
	
	public void marcar() {
		
	}
	

	public Boolean esJoven() {
		
		return cantPapeles==0 && super.esJoven();
	}


}
