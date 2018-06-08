package ejemploHerencia;

import algo2.Ciudad;

public abstract class  Persona {
	private String nombre;
	private Integer dni;
	private Integer edad;
	private Ciudad ciudadNacimiento;
	
	
	
	
	public Persona() {
		nombre="Lucio";
	}
	
	
	
	public Persona(String nombre, Integer dni, Integer edad, Ciudad ciudadNacimiento) {
		this.nombre=nombre;
		this.dni=dni;
		this.edad=edad;
		this.ciudadNacimiento=ciudadNacimiento;
	}

	
	
	public abstract void marcar();
	
	public boolean equals(Object objt) {
		if(objt instanceof Persona) {
			return nombre.equals(((Persona)objt).getNombre()) && ciudadNacimiento.equals(((Persona)objt).getCiudadNacimiento()) && dni.equals(((Persona)objt).getDni()) && edad.equals(((Persona)objt).getEdad());
		}else {
			return false;
		}
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

	public  abstract void printQuienSoy(); //{
		//System.out.println("Soy la clase Persona");
	//}
	
}
