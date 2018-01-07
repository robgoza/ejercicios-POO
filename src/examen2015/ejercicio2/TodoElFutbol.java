package ejercicio2;

/**
 * Clase que modeliza un contrato todo el futbol en el que no se cobra ningun
 * partido pero en el que los gastos fijos se incrementan un 20%
 * 
 * @author Roberto
 *
 */
public class TodoElFutbol extends Contrato {

	public TodoElFutbol(Cliente c) {
		super(c);
	}

	/**
	 * @see Contrato#compra(Partido)
	 * @assertion.post no se factura ningun partido
	 * @assertion.post los gastos fijos se incrementan un 20%
	 */
	@Override
	public void compra(Partido p) {
		setImportePartido(0.0);

		setGastosFijos(getGastosFijos() * 1.20);
	}

}
