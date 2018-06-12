package ejemploInterfaz;

public class Principal {

	public static void main(String[] args) {
		 Volador v=new SuperMan();
		SuperMan s =new SuperMan();
		
		s.volar();
		s.caminar();
		
		v=s;
		
		v.volar();
		((SuperMan)v).caminar();
		

	}

}
