package ejercicio14;

public class Documento implements Procedimientos {
	
	private int numeroDocumento;
	private String fecha;
	private String dniAlumno;

	public Documento(int numeroDocumento, String fecha, String dniAlumno) {
		this.numeroDocumento = numeroDocumento;
		this.fecha = fecha;
		this.dniAlumno = dniAlumno;
	}

	/**
	 * @return the numeroDocumento
	 */
	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento
	 *            the numeroDocumento to set
	 */
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the dniAlumno
	 */
	public String getDniAlumno() {
		return dniAlumno;
	}

	/**
	 * @param dniAlumno
	 *            the dniAlumno to set
	 */
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	@Override
	public boolean consulta(Documento d) {
		if (d instanceof Cd == false) {
			return true;
		}
		return false;
	}

	@Override
	public boolean prestamo(Documento d) {
		if (d instanceof RevistaInformacion == false) {
			return true;
		}
		return false;
	}
}
