package ejercicio11;

public class Componente {
	private String nombre;
	private String modelo;
	private double precio;
	private int[] puertos;
	public Componente(String nombre,String modelo,double precio,int[]puertos){
		assert precio >=0;
		this.nombre=nombre;
		this.modelo=modelo;
		this.precio=precio;
		this.puertos=puertos;
	}
	/**
	 * @return the puertos
	 */
	public int[] getPuertos() {
		return puertos;
	}
	/**
	 * @param puertos the puertos to set
	 */
	public void setPuertos(int[] puertos) {
		this.puertos = puertos;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
}
