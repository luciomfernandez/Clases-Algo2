package ejmeploIterador;

import java.util.Iterator;

public class Iterador {
public static void imprimirIterador(Iterator<?> it) {
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
