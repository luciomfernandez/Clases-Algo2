package Algo2;

public enum Continente2 {
	
	AMERICA(45,483),
	EUROPA(34,45);
	
	private final int cantPaises;
	private final float sup;
	
	Continente2(int cant,float sup){
		this.cantPaises=cant;
		this.sup=sup;
	}
}
