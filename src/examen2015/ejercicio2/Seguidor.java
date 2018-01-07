package ejercicio2;

/**
 * Clase que modeliza el contrato seguidor en el que no se cobra el primer
 * partido ni en los que el equipo del que se es seguidor actue como visitante
 * 
 * @author robgoza
 *
 */
public class Seguidor extends Contrato {
	private String equipo;
	private int contadorPartidos;

	/**
	 * Constructor de la clase
	 * 
	 * @param c
	 *            el cliente del contrato
	 */
	public Seguidor(Cliente c) {
		super(c);
		equipo = c.getEquipo();
	}

	/**
	 * @see Contrato#compra(Partido)
	 * @assertion.post los partidos en los que el equipo actue como visitante no
	 *                 se cobran
	 */
	@Override
	public void compra(Partido p) {
		contadorPartidos++;
		if (p.getVisitante().equals(equipo) == true || contadorPartidos == 1) {
			setImportePartido(0.0);
		}
	}

	/**
	 * @see Contrato#reset()
	 * @assertion.post los valores del equipo y del numero de partidos se
	 *                 reiniciaran
	 */
	@Override
	public void reset() {
		equipo = null;
		contadorPartidos = 0;
	}
}
