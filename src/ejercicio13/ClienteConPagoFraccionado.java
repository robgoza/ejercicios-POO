package ejercicio13;

/**
 * Clase que modeliza un cliente con pago fraccionado
 * 
 * @author robgoza
 *
 */
public abstract class ClienteConPagoFraccionado extends Cliente {
	public static final int NUMERO_DE_PLAZOS = 3;

	/**
	 * Constructor de la clase
	 * 
	 * @param persona
	 *            la persona que va a ser cliente
	 */
	public ClienteConPagoFraccionado(Persona persona) {
		super(persona);
	}

	/**
	 * Metodo que calcula las fracciones del pago
	 * 
	 * @return el resultado de las fracciones
	 */
	public double[] getFraccionesDelPago() {
		double[] resultado = new double[NUMERO_DE_PLAZOS];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = getSaldoDispuesto() / NUMERO_DE_PLAZOS;
		}
		return resultado;
	}

}
