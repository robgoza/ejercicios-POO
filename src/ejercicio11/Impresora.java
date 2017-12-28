package ejercicio11;

public class Impresora extends Salida {
	private String tipo;
	public Impresora(String nombre, String modelo, double precio, int[] puertos,String tipo) {
		super(nombre, modelo, precio, puertos);
		this.tipo=tipo;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
