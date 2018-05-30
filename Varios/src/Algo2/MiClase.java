package Algo2;
import java.util.ArrayList;

public class MiClase {

	private static void imprimirDigitos(int digito) {
		while(digito%10!=0) {		
			System.out.println(digito%10);
			digito=digito/10;
		}
	}
	
	
	public static void main(String[] args) {	
		Continente c;
		System.out.println(Continente.AMERICA);
		c=Continente.AFRICA;
		System.out.println(c);
		System.out.println("HOLA SUSANA");
		int[] arr=new int[30];
		arr[0]=1;
		System.out.println(arr[0]);
		
		int[] arr2= {5,8,9,70,43};
		
		System.out.println(arr2[0]);
		
		Ciudad c1=new Ciudad();
		Ciudad c2=new Ciudad("Roma",20000);
		Ciudad c3=new Ciudad("Rosario",229292);
		
		Persona p1=new Persona("Lucio",23232,c1);
		p1.mudar(c2);
		p1.mudar(c3);
		p1.imprimirCiudades();
		
	} 

	
}


//LOS STRING SON INMUTABLES

//LOS METODOS NO PUEDEN CAMBIAR LA IDENTIDAD DEL OBJETO(EL OBJETO SE PASA POR PARAMETRO COMO UN PUNTERO POR COPIA)

 //FINAL -clases -metodos - variables 
// varoables final: final int i=8; si es final(no modificable) hay que declararla con un valor  obligatoriamente, variable
//final es equivalente a una constante
//metodos final-> no se puede sobrescribir el metodo en las subclases. ej: final public int m(){}
//clases final-> no se pueden crear sub clases de una clase final.

// ENUM-> LISTA DE VALORES, SE TERMINAN COMPORTANDO COMO CONSTANTES.
//ARRAYLIST

/*

ARRAYS:

tipo/clase[]

int[]

Ciudad[]
*/


 
