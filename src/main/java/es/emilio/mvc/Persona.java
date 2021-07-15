package es.emilio.mvc;

public class Persona {

	private int id;
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private int edad;
	private double peso;
	private double estatura;
	private String estado_civil;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAp_pat() {
		return ap_pat;
	}
	public void setAp_pat(String ap_pat) {
		this.ap_pat = ap_pat;
	}
	public String getAp_mat() {
		return ap_mat;
	}
	public void setAp_mat(String ap_mat) {
		this.ap_mat = ap_mat;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

}
