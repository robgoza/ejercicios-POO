package ejercicio2;

/**
 * Clase que modeliza un contrato
 * 
 * @author robgoza
 *
 */
public class Contrato {
	private double gastosFijos;
	private double importePartido;

	/**
	 * Constructor de la clase
	 * 
	 * @param c
	 *            el cliente que va a realizar el contrato
	 */
	public Contrato(Cliente c) {

	}

	/**
	 * Funcion que realiza la compra de un partido
	 * 
	 * @param p
	 *            partido que se va a comprar
	 */
	public void compra(Partido p) {
		importePartido = p.getPrecio();
	}

	/**
	 * Metodo que calcula el importe del contrato
	 * 
	 * @return el importe del contrato
	 */
	public double importe() {
		return gastosFijos + importePartido;

	}

	/**
	 * Funcion que reinicializa el importe del contrato
	 */
	public void reset() {
		gastosFijos = 0.0;
		importePartido = 0.0;

	}

	/**
	 * Metodo que permite conocer los gastos fijos del contrato
	 * 
	 * @return los gastos fijos del contrato
	 */
	public double getGastosFijos() {
		return gastosFijos;
	}

	/**
	 * Funcion que permite modificar los gastos fijos del contrato
	 * 
	 * @param gastosFijos
	 *            los nuevos gastos fijos del contrato
	 */
	public void setGastosFijos(double gastosFijos) {
		this.gastosFijos = gastosFijos;
	}

	/**
	 * Metodo que permite conocer el importe del partido
	 * 
	 * @return el importe del partido
	 */
	public double getImportePartido() {
		return importePartido;
	}

	/**
	 * Funcion que permite modificar el importe del partido
	 * 
	 * @param importePartido
	 *            el nuevo importe del partido
	 */
	public void setImportePartido(double importePartido) {
		this.importePartido = importePartido;
	}
}
