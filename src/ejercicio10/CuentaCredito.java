package ejercicio10;

public class CuentaCredito extends Cuenta {
	private float descubierto;
	private float comision;

	public CuentaCredito(Cliente titular, float descubierto, float comision) {
		super(titular);
		assert descubierto<0;
		assert comision >=0;
		this.descubierto = descubierto;
		this.comision = comision;
	}

	/**
	 * @return the descubierto
	 */
	public float getDescubierto() {
		return descubierto;
	}

	/**
	 * @return the comision
	 */
	public float getComision() {
		return comision;
	}

	@Override
	public void reintegro(float cantidad) {
		assert getSaldo()-cantidad>descubierto;
		setSaldo(getSaldo()-cantidad);
	}
	public void cobraComision(){
		setSaldo(getSaldo()-comision);
	}
}
