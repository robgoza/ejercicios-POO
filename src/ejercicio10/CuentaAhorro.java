package ejercicio10;

public class CuentaAhorro extends Cuenta {
	private float interes;
	public CuentaAhorro(Cliente titular,float interes) {
		super(titular);
		assert getSaldo()>=0;
		this.interes=interes;
	}
	/**
	 * @return the interes
	 */
	public float getInteres() {
		return interes;
	}
	public void interes(){
		if (getSaldo() >1000){
			setSaldo(getSaldo()+interes);
		}
	}
	
}
