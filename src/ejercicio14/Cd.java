package ejercicio14;

public class Cd extends Documento {
	
	private String formato;
	private String licencia;

	public Cd(int numeroDocumento, String fecha, String dniAlumno, String formato, String licencia) {
		super(numeroDocumento, fecha, dniAlumno);
		this.formato = formato;
		this.licencia = licencia;
	}

	/**
	 * @return the formato
	 */
	public String getFormato() {
		return formato;
	}

	/**
	 * @return the licencia
	 */
	public String getLicencia() {
		return licencia;
	}

}
