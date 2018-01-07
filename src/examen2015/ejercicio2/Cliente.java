package ejercicio2;

/**
 * Clase que modeliza un cliente de un contrato
 * 
 * @author robgoza
 *
 */
public class Cliente {
	private String equipo;

	/**
	 * Constructor de la clase
	 * 
	 * @param equipo
	 *            el equipo del que es seguidor el cliente
	 */
	public Cliente(String equipo) {
		this.equipo = equipo;
	}

	/**
	 * Metodo que permite obtener el equipo del que es seguidor el cliente
	 * 
	 * @return el equipo del que es seguidor el cliente
	 */
	public String getEquipo() {
		return equipo;
	}
}
