package ejmeploIterador;


import java.util.ArrayList;
import java.util.Iterator;

public class Generador implements Iterator<Integer> {
	
	private ArrayList<Integer> valoresIntermedios;
	private Integer posActual;
	
	public Generador() {
		
	}
	
	public Generador(Integer valorInicial,Integer valorFinal, Integer incremento){
		posActual=-1;
		valoresIntermedios=new ArrayList<Integer>();
		while(valorInicial<valorFinal) {
			valoresIntermedios.add(valorInicial);
			valorInicial+=incremento;			
		}
	}
	
	
	public boolean hasNext() {
		return posActual<valoresIntermedios.size()-1;
	}
	
	public Integer next() {
		posActual+=1;
		return valoresIntermedios.get(posActual);
	}
	
	public void remove() {
		
	}
		

}
