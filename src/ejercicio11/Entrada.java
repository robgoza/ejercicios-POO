package ejercicio11;

public class Entrada extends Componente{
	private String conector;
	public Entrada(String nombre, String modelo, double precio, int[] puertos,String conector) {
		super(nombre, modelo, precio, puertos);
		this.conector=conector;
	}
	/**
	 * @return the conector
	 */
	public String getConector() {
		return conector;
	}
	/**
	 * @param conector the conector to set
	 */
	public void setConector(String conector) {
		this.conector = conector;
	}

}
