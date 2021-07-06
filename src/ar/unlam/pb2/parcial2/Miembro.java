package ar.unlam.pb2.parcial2;

public abstract class Miembro {
	private String nombre;
	private String apellido;
	private Integer dni;
	private String equipo;
	
	public Miembro(String nombre, String Apellido, Integer dni, String equipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.equipo = equipo;
	}
}
