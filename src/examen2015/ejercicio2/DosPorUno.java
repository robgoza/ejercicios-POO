package ejercicio2;

/**
 * Clase que modeliza el contrato dos por uno en el que solo se cobra uno de
 * cada dos partidos y en el que el precio del resto de la factura se incrementa
 * en un 5%
 * 
 * @author robgoza
 *
 */
public class DosPorUno extends Contrato {
	private int contadorPartidos;

	/**
	 * Constructor de la clase
	 * 
	 * @param c
	 *            el cliente que va a adquirir el contrato
	 */
	public DosPorUno(Cliente c) {
		super(c);
	}

	/**
	 * @see Contrato#compra(Partido)
	 * @assertion.post solo se cobra un partido de cada dos
	 * @assertion.post los gastos fijos se incrementan un 5%
	 */
	@Override
	public void compra(Partido p) {
		contadorPartidos++;
		if (contadorPartidos % 2 == 0) {
			setImportePartido(0.0);
		}
		setGastosFijos(getGastosFijos() * 1.05);
	}

	/**
	 * @see Contrato#reset()
	 * @assertion.post el valor del numero de partidos se reiniciara
	 */
	@Override
	public void reset() {

		contadorPartidos = 0;
	}
}
