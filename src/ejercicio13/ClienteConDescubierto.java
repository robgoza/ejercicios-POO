package ejercicio13;

/**
 * Clase que modeliza un cliente con un descubierto
 * 
 * @author robgoza
 *
 */
public class ClienteConDescubierto extends ClienteConPagoFraccionado {
	/**
	 * Constructor de la clase
	 * 
	 * @param persona
	 *            la persona que va a ser cliente
	 */
	public ClienteConDescubierto(Persona persona) {
		super(persona);
	}

	/**
	 * @see ClienteConPagoFraccionado#getFraccionesDelPago()
	 */
	@Override
	public double[] getFraccionesDelPago() {
		double[] resultado = new double[3];
		resultado[0] = 0.5 * getSaldoDispuesto();
		resultado[1] = 0.25 * getSaldoDispuesto();
		resultado[2] = resultado[1];
		return resultado;
	}

}