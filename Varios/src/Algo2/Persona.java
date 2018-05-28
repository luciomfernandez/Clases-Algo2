package Algo2;

public class Persona {
	private String nombre;
	private int dni;
	private Ciudad ciudadActual;
	private Ciudad ciudadAnterior;
	
	
	public Persona(String nombre, int dni, Ciudad actual) {
		this.nombre=nombre;
		this.dni=dni;
		ciudadActual=actual/*new Ciudad(actual.obtNombre(),actual.obtCantHabitantes())*/;
		ciudadAnterior=null/*new Ciudad(actual.obtNombre(),actual.obtCantHabitantes())*/;
	
	
	}
	
	public void mudar(Ciudad nuevaCiudad) {
		if(!(ciudadActual.equals(ciudadAnterior))) {
			System.out.println("Ok, se puede mudar");
			ciudadAnterior=ciudadActual;
			ciudadActual=nuevaCiudad;
		}else {
			System.out.println("No se puede mudar a la misma ciudad");
		}
	}

	
	public int getDni() {
		return dni;
	}
	
	public Ciudad getCiudadActual() {
		return ciudadActual;
	}
	
	public Ciudad getCiudadAnterior() {
		return ciudadAnterior;
	}
	
	
	public String getNombrePersona() {
		return nombre;
	}
	
	


}

