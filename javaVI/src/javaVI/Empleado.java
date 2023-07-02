package javaVI;

public class Empleado {
	protected String nombre;
	protected String domicilio;
	protected String legajo;
	protected String cargo;

	public Empleado(String nombre, String domicilio, String legajo, String cargo) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.legajo = legajo;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String detalle() {
		return "\nNombre: " + nombre + ", Domicilio: " + domicilio + ", Legajo: " + legajo + ", Cargo: " + cargo;
	}
}
