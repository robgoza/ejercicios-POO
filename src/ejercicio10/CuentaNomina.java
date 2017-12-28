package ejercicio10;

public class CuentaNomina extends Cuenta{
	private  float nomina;
	private float interes;
	private final float comision;
	public CuentaNomina(Cliente titular) {
		super(titular);
		comision=0;
	}
	@Override
	public void reintegro(float cantidad){
		assert getReintegro() <=-nomina;
	}
	public void interes(){
		if (getSaldo() >0){
			setSaldo(getSaldo()-interes);
		}
		
	}
	public void cobraComision(){
		setSaldo(getSaldo()-comision);	}
	/**
	 * @return the nomina
	 */
	public float getNomina() {
		return nomina;
	}
	/**
	 * @param nomina the nomina to set
	 */
	public void setNomina(float nomina) {
		this.nomina = nomina;
	}
	/**
	 * @return the interes
	 */
	public float getInteres() {
		return interes;
	}
	/**
	 * @param interes the interes to set
	 */
	public void setInteres(float interes) {
		this.interes = interes;
	}
	/**
	 * @return the comision
	 */
	public float getComision() {
		return comision;
	}
}
