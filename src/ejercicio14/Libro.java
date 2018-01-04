package ejercicio14;

public class Libro extends Documento {
	
	private String titulo;
	private String autor;
	private int anoPublicacion;

	public Libro(int numeroDocumento, String fecha, String dniAlumno, String titulo, String autor, int anoPublicacion) {
		super(numeroDocumento, fecha, dniAlumno);
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @return the anoPublicacion
	 */
	public int getAnoPublicacion() {
		return anoPublicacion;
	}

}
