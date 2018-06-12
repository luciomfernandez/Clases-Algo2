package ejemploInterfaz;
public class Avion implements Volador {

	@Override
	public void volar() {
		System.out.println("Soy Avion y vuelo");
	}
}
