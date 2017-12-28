package ejercicio10;

public class Cuenta {
	private String nombreTitular;
	private float saldo;
	private Cliente titular;
	private float reintegro;
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the nombreTitular
	 */
	public String getNombreTitular() {
		return nombreTitular;
	}
	/**
	 * @return the reintegro
	 */
	public float getReintegro() {
		return reintegro;
	}
	public Cuenta (Cliente titular){
		this.nombreTitular=titular.getNombre();
		this.saldo=0;
	}
	public Cliente getTitular(){
		return titular;
	}
	public float getSaldo(){
		return saldo;
	}
	public void reintegro(float cantidad){
		saldo=getSaldo()-cantidad;
	}
	public void ingreso (float cantidad){
		saldo=getSaldo()+cantidad;
	}
}
