package ejemploHerencia;

import java.util.ArrayList;

import algo2.Ciudad;

public class Principal {

	public static void funcPrueba(Persona p) {
		System.out.println("Nombre: "+p.getNombre());
		System.out.println(p.esJoven());
	}	
	
	
	public static void main(String[] args) {
		
			
	
				
		Materia m1=new Materia("Matematica");
		Materia m2=new Materia("Lengua");
		Materia m3=new Materia("Sociales");
		Materia m4=new Materia("Algebra");
		
		
		 
		ArrayList<Materia> materias= new ArrayList<Materia>();
		 
		
		materias.add(m1);
		materias.add(m2);
		materias.add(m3);
		materias.add(m4);

		Ciudad c1 = new Ciudad("Buenos Aires",20000);
		
		Alumno a1=new Alumno(235,materias,"Lucio",39999,10,c1);
		Docente d1=new Docente("Director","Lucio",39999,10,c1);

		
		d1.marcar();
				
		
	
	
	}

}
