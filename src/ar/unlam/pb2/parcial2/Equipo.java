package ar.unlam.pb2.parcial2;

import java.util.HashSet;

public class Equipo {

	public String nombre;
	public HashSet<Miembro> miembros;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean agregarMiembro(Miembro miembro) {
		return 	miembros.add(miembro);
	}
	
}
