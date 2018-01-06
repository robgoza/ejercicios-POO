package ejercicio13;

import java.time.LocalDate;

/**
 * Clase que modeliza una persona (auxiliar al problema pero necesaria)
 * 
 * @author robgoza
 *
 */
public class Persona {
	private String nombre;
	private String dni;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

}
