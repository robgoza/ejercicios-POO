package ejercicio1;

/**
 * Clase generica elemento que implementa el elemento que va a ser introducido
 * en el buffer
 * 
 * @author robgoza
 *
 * @param <E>
 *            el elemento de tipo generico
 */
public class Elemento<E> implements Entrada {
	private int prioridad;

	public Elemento() {

	}

	@Override
	public int getPrioridad() {
		return prioridad;
	}
}
