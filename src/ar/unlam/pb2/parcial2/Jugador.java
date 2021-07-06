package ar.unlam.pb2.parcial2;

public class Jugador extends Miembro {

	private Integer nroCamiseta;
	private String posicion;
	
	public Jugador(String nombre, String Apellido, Integer dni, Integer nroCamiseta, String posicion, String equipo) {
		super(nombre, Apellido, dni, equipo);
		this.nroCamiseta = nroCamiseta;
		this.posicion = posicion;
		
	}

	public Integer getNroCamiseta() {
		return nroCamiseta;
	}

	public String getPosicion() {
		return posicion;
	}
	
	

}
