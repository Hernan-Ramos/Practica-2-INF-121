package Agregacion;

public class Conductor {
	private String nombre;
	private String licencia;
	public Conductor(String nombre, String licencia) {
		this.nombre = nombre;
		this.licencia = licencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", licencia=" + licencia + "]";
	}
	
	
}
