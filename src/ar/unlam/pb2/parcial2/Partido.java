package ar.unlam.pb2.parcial2;

import java.util.ArrayList;
import java.util.HashSet;

public class Partido {
	
	private Integer nroDePartido;
	private Equipo local;
	private Equipo visitante;
	private HashSet<Dt> dts;
	private HashSet<Jugador> nominaLocal;
	private HashSet<Jugador> nominaVisitante;
	private ArrayList<Gol> goles;
	
	public Partido(Equipo local, Equipo visitante, Integer nroDePartido) {
		this.local = local;
		this.visitante = visitante;
		this.nroDePartido = nroDePartido;
		
	}
	
	public Boolean registrarGol(Integer nroDeCamiseta, Integer minuto, String localOVisitante) {
		Gol nuevo = new Gol(nroDeCamiseta,minuto,localOVisitante);
		return goles.add(nuevo);
	}
		
	

	public Integer getNroDePartido() {
		return nroDePartido;
	}

	public Equipo getLocal() {
		return local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public HashSet<Jugador> getNominaLocal() {
		return nominaLocal;
	}

	public HashSet<Jugador> getNominaVisitante() {
		return nominaVisitante;
	}
	
	public HashSet<Dt> getDts(){
		return dts;
	}

	public ArrayList<Gol> getGoles() {
		return goles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroDePartido == null) ? 0 : nroDePartido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		if (nroDePartido == null) {
			if (other.nroDePartido != null)
				return false;
		} else if (!nroDePartido.equals(other.nroDePartido))
			return false;
		return true;
	}
	
	

}
