package ejercicio13;

/**
 * Clase que modeliza un cliente
 * 
 * @author robgoza
 *
 */
public class Cliente {
	private float saldoDispuesto = 1000;
	private float cargoAutorizado = 1000;

	/**
	 * Metodo de la clase
	 * 
	 * @param p
	 *            la persona que va a ser el cliente
	 */
	public Cliente(Persona p) {

	}

	/**
	 * Funcion que permite cargar un importe a la cuenta
	 * 
	 * @param importe
	 *            el importe a cargar
	 * @assertion.pre el importe debe de ser mayor o igual a 0
	 */
	public void cargar(float importe) {
		assert importe >= 0;
		saldoDispuesto = saldoDispuesto + importe;
	}

	/**
	 * @return the saldoDispuesto
	 */
	public float getSaldoDispuesto() {
		return saldoDispuesto;
	}

	/**
	 * @return the cargoAutorizado
	 */
	public float getCargoAutorizado() {
		return cargoAutorizado;
	}
}
