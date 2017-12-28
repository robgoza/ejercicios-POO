package ejercicio11;

public class Laser extends Impresora {
	private int paginas;
	public Laser(String nombre, String modelo, double precio, int[] puertos, String tipo,int paginas) {
		super(nombre, modelo, precio, puertos, tipo);
		this.paginas=paginas;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}
	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

}
