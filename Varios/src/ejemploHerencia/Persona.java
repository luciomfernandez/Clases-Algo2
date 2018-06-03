package ejemploHerencia;

import algo2.Ciudad;

public class Persona {
	private String nombre;
	private Integer dni;
	private Integer edad;
	private Ciudad ciudadNacimiento;
	
	
	public Persona(String nombre, Integer dni, Integer edad, Ciudad ciudadNacimiento) {
		this.nombre=nombre;
		this.dni=dni;
		this.edad=edad;
		this.ciudadNacimiento=ciudadNacimiento;
	}

	
	
	public Boolean esJoven() {
		return edad<=20 && ciudadNacimiento.obtNombre().equals("Buenos Aires");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Ciudad getCiudadNacimiento() {
		return ciudadNacimiento;
	}

	public void setCiudadNacimiento(Ciudad ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

}
