package ejercicio1;

import java.util.ArrayList;

/**
 * Clase que modeliza un buffer de elementos con prioridad
 * 
 * @author robgoza
 *
 * @param <E>
 *            el elemento
 */
public class Buffer<E> extends Elemento {
	private ArrayList<Elemento> bufferAlta;
	private ArrayList<Elemento> bufferMedia;
	private ArrayList<Elemento> bufferBaja;

	/**
	 * Metodo constructor
	 */
	public Buffer() {
		bufferAlta = new ArrayList<Elemento>();
		bufferMedia = new ArrayList<Elemento>();
		bufferBaja = new ArrayList<Elemento>();

	}

	/**
	 * Funcion para insertar un elemento en el buffer
	 * 
	 * @param elem
	 *            el elemento a insertar
	 * @assertion.pre el elemento no puede ser nulo
	 */
	public void insertar(Elemento elem) {
		assert (elem != null);
		switch (elem.getPrioridad()) {
		case 0:
			bufferBaja.add(elem);
		case 1:
			bufferMedia.add(elem);
		case 2:
			bufferAlta.add(elem);
		}
	}

	/**
	 * Funcion para eliminar un elemento del buffer
	 * 
	 * @param elem
	 *            el elemento a eliminar
	 * @assertion.pre el buffer debe contener algun elemento
	 */
	public void sacar(E elem) {
		assert (!vacio());
		if (bufferAlta.contains(primero())) {
			bufferAlta.remove(primero());
		} else if (bufferMedia.contains(primero())) {
			bufferMedia.remove(primero());
		} else if (bufferBaja.contains(primero())) {
			bufferBaja.remove(primero());
		}
	}

	/**
	 * Metodo que devuelve el primer elemento del buffer atendiendo a la
	 * prioridad
	 * 
	 * @return el primer elemento del buffer
	 */
	public Elemento primero() {
		if (!bufferAlta.isEmpty()) {
			return bufferAlta.get(0);
		} else if (!bufferMedia.isEmpty()) {
			return bufferMedia.get(0);
		}
		return bufferBaja.get(0);

	}

	/**
	 * Metodo que comprueba si el buffer esta vacio
	 * 
	 * @return true si el buffer esta vacio, en caso contrario false
	 */
	public boolean vacio() {
		if (bufferAlta.isEmpty() && bufferMedia.isEmpty() && bufferBaja.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
