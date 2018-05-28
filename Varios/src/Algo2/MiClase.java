package Algo2;
import java.util.Scanner;


public class MiClase {

	private static void imprimirDigitos(int digito) {
		while(digito%10!=0) {		
			System.out.println(digito%10);
			digito=digito/10;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		System.out.println("Ingrese un numero");
		
		
	
	}

	
}


//LOS STRING SON INMUTABLES

//LOS METODOS NO PUEDEN CAMBIAR LA IDENTIDAD DEL OBJETO(EL OBJETO SE PASA POR PARAMETRO COMO UN PUNTERO POR COPIA)

 











