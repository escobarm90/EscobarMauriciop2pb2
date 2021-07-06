package ar.unlam.pb2.parcial2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PartidoTest {
	
	@Test
	public void queLosPartidosSeEnumerenAutomaticamente() {
		Equipo boca = new Equipo();
		Equipo river = new Equipo();
		Partido nuevo = new Partido(boca, river);
		Partido nuevo2 = new Partido(boca, river);
		Partido nuevo3 = new Partido(boca, river);
		
		assertEquals(1,nuevo.getNroDePartido(),0.01);
		assertEquals(2,nuevo2.getNroDePartido(),0.01);
		assertEquals(3,nuevo3.getNroDePartido(),0.01);
	}
	
	@Test
	public void queSePuedanRegistrarMiembrosAlTorneo() {
		Jugador gonzalo = new Jugador("Gonzalo","Montiel",1111 ,4,"DEF","Argentina");
		Miembro guillermo = new Jugador("Guillermo","Maripan",2222 ,5,"DEF","Chile");
		Dt lionel = new Dt("Lionel","Scaloni" ,88888,"Argentina",45);
		Miembro martin = new Dt("Martin","Lasarte",9999 ,"Chile",50);
		Equipo boca = new Equipo();
		Equipo river = new Equipo();
		Partido nuevo = new Partido(boca, river);
		Partido nuevo2 = new Partido(boca, river);
		Partido nuevo3 = new Partido(boca, river);
		
	}

}
