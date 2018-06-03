	package algo2;

public class Ciudad {
	private String nombre;
	private int cantHabitantes;
	
	//Se pisa el constructor por defecto
	public Ciudad(String nombre, int cantHabitantes) {
		this.nombre=nombre;
		this.cantHabitantes=cantHabitantes;
	}
	
	public Ciudad() {
		this("Buenos Aires",4970000);
		System.out.println("Constr def");
	}
	
	public String obtNombre() {
		return nombre;
	}
	
	public int obtCantHabitantes() {
		return cantHabitantes;
	}

	public void incHab(int cant) {
		cantHabitantes+=cant;
	}

	public void setNombreC(String nom){
		nombre=nom;
	}
	
	public void setCantH(int h) {
		cantHabitantes=h;
	}
	
	
	public boolean equals(Object o) {
		return (o instanceof Ciudad) && ((Ciudad)o).obtNombre().equals(this.nombre); 
	}		
		
	public String toString() {
		
			return "Ciudad: "+this.nombre+"Cant habitantes: "+this.cantHabitantes;
				
		
	}
	


}	
