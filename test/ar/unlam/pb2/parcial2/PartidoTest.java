package ar.unlam.pb2.parcial2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.unlam.pb2.parcial2.esceptions.JugadorNoEncontradoException;

public class PartidoTest {
	
	
	@Test
	public void queSePuedanRegistrarMiembrosAlTorneo() {
		Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Jugador guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");	
		Equipo argentina = new Equipo("Argentina");
		Equipo chile = new Equipo("Chile");
		Partido nuevo = new Partido(argentina,chile,1);
		Partido nuevo2 = new Partido(argentina,chile,1);
		Partido nuevo3 = new Partido(argentina, chile,3);
		Torneo nuevoTorneo = new Torneo("Copa America");
		
		nuevoTorneo.agregarJugador(gonzalo);
		nuevoTorneo.agregarJugador(guillermo);
		
		
		Integer ve = 2;
		assertEquals(ve,nuevoTorneo.getJugadores().size(),0.01);
		
	}
	
	@Test(expected=JugadorNoEncontradoException.class)
	public void queSeLanceUnaEXcepcionSiElJugadorNoExiste()throws Exception {
		Miembro gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Miembro guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");	
		Equipo argentina = new Equipo("Argentina");
		Equipo chile = new Equipo("Chile");
		Partido nuevo = new Partido(argentina,chile,1);
		Partido nuevo2 = new Partido(argentina,chile,1);
		Partido nuevo3 = new Partido(argentina, chile,3);
		Torneo nuevoTorneo = new Torneo("Copa America");
		
		nuevoTorneo.agregarMiembro(gonzalo);
		nuevoTorneo.agregarMiembro(marcelo);
	}
	
	@Test
	public void queSePuedanRegistrarLosPartidosAlTorneo() {
	Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
	Miembro guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");
	Dt lionel = new Dt("Lionel","Scaloni" ,88888,"Argentina",45);
	Miembro martin = new Dt("Martin","Lasarte",9999 ,"Chile",50);
	Equipo argentina = new Equipo("Argentina");
	Equipo chile = new Equipo("Chile");
	Partido nuevo = new Partido(argentina,chile,1);
	Partido nuevo2 = new Partido(argentina,chile,1);
	Partido nuevo3 = new Partido(argentina, chile,3);
	

	}
}
