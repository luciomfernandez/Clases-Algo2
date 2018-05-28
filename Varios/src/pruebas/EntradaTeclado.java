package pruebas;
import java.util.Scanner;
public class EntradaTeclado {
	private Scanner teclado;
	private String entrada;
	
	public EntradaTeclado() {
		teclado=new Scanner(System.in);
		System.out.println("Ingrese texto");
		entrada=teclado.nextLine();
	}	

	public void imprimirEntrada() {
		System.out.println("La entrada ingresada fue: "+entrada);
	}

}
