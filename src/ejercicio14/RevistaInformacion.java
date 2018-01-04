package ejercicio14;

public class RevistaInformacion extends Revista {
	
	private int codigo;

	public RevistaInformacion(int numeroDocumento, String fecha, String dniAlumno, String titulo, String autor,
			int anoPublicacion, int volumen, int numero, String mesSalida, int codigo) {
		super(numeroDocumento, fecha, dniAlumno, titulo, autor, anoPublicacion, volumen, numero, mesSalida);
		this.codigo = codigo;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

}
