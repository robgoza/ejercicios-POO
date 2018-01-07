package ejercicio2;

/**
 * Clase que implementa un partido entre dos equipos
 * 
 * @author robgoza
 *
 */
public class Partido {
	private String local;
	private String visitante;
	private double precio;

	/**
	 * Constructor de la clase
	 * 
	 * @param local
	 *            el equipo que actua como local
	 * @param visitante
	 *            el equipo que actua como visitante
	 * @param precio
	 *            el precio del partido
	 */
	public Partido(String local, String visitante, double precio) {
		this.local = local;
		this.visitante = visitante;
		this.precio = precio;
	}

	/**
	 * Metodo que permite conocer el precio del partido
	 * 
	 * @return el precio del partido
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo que permite conocer el equipo que actua como local
	 * 
	 * @return el equipo local
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * Metodo que permite conocer el equipo que actua como visitante
	 * 
	 * @return el equipo visitante
	 */
	public String getVisitante() {
		return visitante;
	}
}
