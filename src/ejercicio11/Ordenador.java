package ejercicio11;

import ejercicio11.Componente;
import java.util.*;

public class Ordenador {
	private ArrayList<Componente> ordenador;

	public Ordenador(Componente a, Componente b, Componente c) {
		assert esCorrecto() == true;
		ordenador.add(a);
		ordenador.add(b);
		ordenador.add(c);
	}

	public int numeroComponentesEntrada() {
		int numero = 0;
		for (Componente e : ordenador) {
			if (e instanceof Entrada) {
				numero++;
			}
		}
		return numero;
	}

	public int numeroComponentesSalida() {
		int numero = 0;
		for (Componente e : ordenador) {
			if (e instanceof Salida) {
				numero++;
			}
		}
		return numero;
	}

	public boolean esCorrecto() {
		if (ordenador.size() >= 3 && numeroComponentesSalida() >= 1 && numeroComponentesEntrada() >= 1) {
			return true;
		}
		return false;
	}
}
