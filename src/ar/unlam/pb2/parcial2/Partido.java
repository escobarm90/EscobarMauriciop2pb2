package ar.unlam.pb2.parcial2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Partido {
	public static Integer contadorGoles = 0;
	private static Integer contador = 1;
	private Integer nroDePartido;
	private String equipoLocal;
	private String equipoVisitante;	
	private HashSet<Jugador> nominaLocal;
	private HashSet<Jugador> nominaVisitante;
	private ArrayList<Gol> goles;
	private Integer golesVisitante = 0;
	private Integer golesLocal = 0;
	private Integer nroDeGoles = 0;
	
	public Partido(String local, String visitante) {
		this.nominaLocal = new HashSet<Jugador>();
		this.nominaVisitante = new HashSet<Jugador>();
		this.goles = new ArrayList<Gol>();
		this.equipoLocal = local;
		this.equipoVisitante = visitante;		
		this.nroDePartido = contador;
		contador++;
	}
	
	public void registrarGol(Integer nroDeCamiseta, Integer minuto, String localOVisitante) {
		Gol nuevo = new Gol(nroDeCamiseta,minuto,localOVisitante);
		goles.add(nuevo);
		contadorGoles++;
	}
	
	public void agregarJugadorLocal( Jugador jugador) {
		nominaLocal.add(jugador);
	}
	
	public void agregarJugadorVisitante(Jugador jugador) {
		nominaVisitante.add(jugador);
	}
	

	public Integer getNroDePartido() {
		return nroDePartido;
	}

	public String getLocal() {
		return equipoLocal;
	}

	public String getVisitante() {
		return equipoVisitante;
	}

	public HashSet<Jugador> getNominaLocal() {
		return nominaLocal;
	}

	public HashSet<Jugador> getNominaVisitante() {
		return nominaVisitante;
	}
	
	public ArrayList<Gol> getGol() {
		return goles;
	}
	
	
	
	public void getGoles() {
		for(Gol gol: goles) {
			if(gol.getGoleador().equals("Visitante")) {
				golesVisitante++;
		}else if(gol.getGoleador().equals("Local")){
				golesLocal++;
				}
			}
		}
	
	public String getGanador() {
		getGoles();
		if(golesVisitante>golesLocal) {
			return "Visitante";
	}else if (golesVisitante<golesLocal) {
		return "Local";}
	else return "Empate";
		}
	
	public String presentarGolesCronologicamente(){
		return getGol().toString();
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
