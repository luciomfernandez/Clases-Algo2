package ejemploHerencia;

public class Principal {

	public static void main(String[] args) {
		Persona p1=new Persona();
		Alumno a1=new Alumno();

		p1=a1;
		
		p1.printQuienSoy();
		
	}

}
