package ejercicio14;

public class Revista extends Libro {
	
	private int volumen;
	private int numero;
	private String mesSalida;

	public Revista(int numeroDocumento, String fecha, String dniAlumno, String titulo, String autor, int anoPublicacion,
			int volumen, int numero, String mesSalida) {
		super(numeroDocumento, fecha, dniAlumno, titulo, autor, anoPublicacion);
		this.volumen = volumen;
		this.numero = numero;
		this.mesSalida = mesSalida;

	}

	/**
	 * @return the volumen
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the mesSalida
	 */
	public String getMesSalida() {
		return mesSalida;
	}

}
