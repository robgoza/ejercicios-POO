package ejercicio13;

/**
 * Clase que modeliza un cliente con un descuento variable
 * 
 * @author robgoza
 *
 */
public class ClienteConDescuentoVariable extends ClienteConPagoFraccionado {
	private float descuento;

	/**
	 * Constructor de la clase
	 * 
	 * @param persona
	 *            la persona que va a ser cliente
	 * @param descuento
	 *            el descuento que se le va a aplicar
	 */
	public ClienteConDescuentoVariable(Persona persona, float descuento) {
		super(persona);
		setDescuento(descuento);
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		if (descuento <= 0)
			throw new IllegalArgumentException(
					"descuento no positivo: El descuento debe ser un número mayor que cero y menor que 100");
		if (descuento >= 100)
			throw new IllegalArgumentException(
					"descuento mayor o igual que 100: El descuento debe ser un número mayor que cero y menor que 100");
		this.descuento = descuento;
	}

	/**
	 * @see Cliente#cargar(float)
	 */
	@Override
	public void cargar(float importe) {
		if (getSaldoDispuesto() + importe > getCargoAutorizado())
			throw new IllegalArgumentException("Importe mayor que el cargo autorizado");
		super.cargar(importe * (100 - descuento) / 100);
	}

}