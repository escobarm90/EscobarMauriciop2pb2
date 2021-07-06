package ar.unlam.pb2.parcial2;

import java.util.HashSet;

import ar.unlam.pb2.parcial2.esceptions.JugadorNoEncontradoException;

public class Torneo {
	
	private String nombre;
	private HashSet<Partido> partidos;
	private HashSet<Miembro> miembros;
	
	public Torneo(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean agregarmiembro(Miembro miembro)throws Exception {
		for(Partido partidoBuscado: partidos) {
			if(partidoBuscado.getNominaLocal().contains(miembro) == true && partidoBuscado.getNominaVisitante().contains(miembro) == true) {
				return miembros.add(miembro);				
				}
			else throw new JugadorNoEncontradoException("Jugador no existente");
			}
		return null;
		}	
	
	
	
	
}