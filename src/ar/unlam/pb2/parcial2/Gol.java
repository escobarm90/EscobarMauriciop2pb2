package ar.unlam.pb2.parcial2;

public class Gol implements Comparable<Gol> {
	
	private Integer nroDePartido;
	private Integer nroDeCamiseta;
	private Integer minuto;
	private String localOVisitante;
	private Integer nroDeGol;
	private static Integer contadorGoles = 0;
	
	public Gol(Integer nroDeCamiseta, Integer minuto, String localOVisitante) {
		this.nroDeCamiseta = nroDeCamiseta;
		this.minuto = minuto;
		this.localOVisitante = localOVisitante;
		this.nroDeGol = contadorGoles;
		contadorGoles++;
	}
	
	public String getGoleador() {
		return this.localOVisitante;
	}

	@Override
	public String toString() {
		return "Jugador " + nroDeCamiseta + " min " + minuto;
	}

	@Override
	public int compareTo(Gol o) {
		return this.minuto.compareTo(minuto);
	}


	
	

}
