package ar.unlam.pb2.parcial2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import ar.unlam.pb2.parcial2.esceptions.JugadorNoEncontradoException;

public class PartidoTest {
	
	
	@Test
	public void queSePuedanRegistrarMiembrosAlTorneo() throws Exception {
		Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Jugador guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");	
		Partido nuevoPartido = new Partido("Argentina", "Chile");
		Partido nuevo2 = new Partido("argentina","chile");
		Partido nuevo3 = new Partido("argentina", "chile");
		Torneo nuevoTorneo = new Torneo("Copa America");
		
		nuevoPartido.agregarJugadorLocal(guillermo);
		nuevoPartido.agregarJugadorVisitante(gonzalo);
		
		nuevoTorneo.agregarPartido(nuevoPartido);
		
		nuevoTorneo.agregarMiembro(gonzalo);
		nuevoTorneo.agregarMiembro(guillermo);
		
		
		Integer ve = 2;
		assertEquals(ve,nuevoTorneo.getJugadores().size(),0.01);
		
	}
	
	@Test(expected=JugadorNoEncontradoException.class)
	public void queSeLanceUnaExcepcionSiElJugadorNoEstaEnLaNomina() throws Exception {
		Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Jugador guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");	
		Partido nuevoPartido = new Partido("Argentina", "Chile");
		Partido nuevo2 = new Partido("argentina","chile");
		Partido nuevo3 = new Partido("argentina", "chile");
		Torneo nuevoTorneo = new Torneo("Copa America");
		
	
		nuevoPartido.agregarJugadorVisitante(gonzalo);
		
		nuevoTorneo.agregarPartido(nuevoPartido);
		
		nuevoTorneo.agregarMiembro(gonzalo);
		nuevoTorneo.agregarMiembro(guillermo);
		
		
		Integer ve = 2;
		assertEquals(ve,nuevoTorneo.getJugadores().size(),0.01);
		
	}
	
	@Test
	public void queSeRegistrenLosGolesCorrectamente() throws Exception {
		Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Jugador guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");	
		Partido nuevoPartido = new Partido("Argentina", "Chile");
		Torneo nuevoTorneo = new Torneo("Copa America");
		
		nuevoPartido.agregarJugadorLocal(guillermo);
		nuevoPartido.agregarJugadorVisitante(gonzalo);
		
		nuevoTorneo.agregarPartido(nuevoPartido);
		
		nuevoTorneo.agregarMiembro(gonzalo);
		nuevoTorneo.agregarMiembro(guillermo);		
		Integer ve = 2;
		assertEquals(ve,nuevoTorneo.getJugadores().size(),0.01);
		
		nuevoPartido.registrarGol(4, 90, "Local");
		
		assertEquals(nuevoPartido.getGol().toString(), "[Jugador 4 min 90]");	
		
	}
	
	@Test
	public void queSeInformeUnGanadorPerdedorOEmpate()throws Exception {
		Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Jugador guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");	
		Partido nuevoPartido = new Partido("Argentina", "Chile");
		Torneo nuevoTorneo = new Torneo("Copa America");
		
		nuevoPartido.agregarJugadorLocal(guillermo);
		nuevoPartido.agregarJugadorVisitante(gonzalo);
		
		nuevoTorneo.agregarPartido(nuevoPartido);
		
		nuevoTorneo.agregarMiembro(gonzalo);
		nuevoTorneo.agregarMiembro(guillermo);		
		Integer ve = 2;
		assertEquals(ve,nuevoTorneo.getJugadores().size(),0.01);
		
		nuevoPartido.registrarGol(4, 90, "Local");
		
		assertEquals("Local",nuevoPartido.getGanador());
	}
	
	@Test
	public void obtenerUnaListaDeGolesOrdenadaCronologicamente()throws Exception {
		
		Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Jugador guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");	
		Partido nuevoPartido = new Partido("Argentina", "Chile");
		Torneo nuevoTorneo = new Torneo("Copa America");
		
		nuevoPartido.agregarJugadorLocal(guillermo);
		nuevoPartido.agregarJugadorVisitante(gonzalo);
		
		nuevoTorneo.agregarPartido(nuevoPartido);
		
		nuevoTorneo.agregarMiembro(gonzalo);
		nuevoTorneo.agregarMiembro(guillermo);		
		Integer ve = 2;
		assertEquals(ve,nuevoTorneo.getJugadores().size(),0.01);
		
		nuevoPartido.registrarGol(4, 5, "Local");
		nuevoPartido.registrarGol(4, 10, "Visitante");
		nuevoPartido.registrarGol(4, 20, "Local");
		nuevoPartido.registrarGol(4, 40, "Local");
		
		
		
		assertEquals(nuevoPartido.presentarGolesCronologicamente(),"[Jugador 4 min 5, Jugador 4 min 10, Jugador 4 min 20, Jugador 4 min 40]");
	}
	
	
	
	
	
	
}