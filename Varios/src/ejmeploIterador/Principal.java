package ejmeploIterador;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	
	
	public static void main(String[] args) {
		ArrayList<String> pepe=new ArrayList<String>();
		pepe.add("Mauro");
		pepe.add("lUCIO");
		pepe.add("PEPE");
		
		Iterator<String> it=pepe.iterator();
		
		Generador gr=new Generador(5,20,4);
		
		
		Iterador.imprimirIterador(it);
		Iterador.imprimirIterador(gr);
	}

}
