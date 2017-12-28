package ejercicio10;

public class CuentaJoven extends CuentaAhorro{

	public CuentaJoven(Cliente titular, float interes) {
		super(titular, interes);
		assert titular.getEdad()<25;
	}
	@Override
	public void interes(){
		setSaldo(getSaldo()+getInteres());	}

}
