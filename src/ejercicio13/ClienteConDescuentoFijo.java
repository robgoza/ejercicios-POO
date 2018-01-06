package ejercicio13;

/**
 * Clase que modeliza un cliente con un descubierto fijo
 * 
 * @author robgoza
 *
 */
public class ClienteConDescuentoFijo extends ClienteConPagoFraccionado {
	public static final float DESCUENTO_FIJO = 15;

	/**
	 * Constructor de la clase
	 * 
	 * @param persona
	 *            la persona que va a ser cliente
	 */
	public ClienteConDescuentoFijo(Persona persona) {
		super(persona);
	}

	/**
	 * @see Cliente#cargar(float)
	 */
	@Override
	public void cargar(float importe) {
		if (getSaldoDispuesto() + importe > getCargoAutorizado())
			throw new IllegalArgumentException("Importe mayor que el cargo autorizado");
		super.cargar(importe * (100 - DESCUENTO_FIJO) / 100);
	}
}
