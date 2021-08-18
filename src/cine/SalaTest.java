package cine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalaTest {
Sala sala;

	@Before
	public void setup() {
		sala = new Sala(22, 4);
	}

	@Test
	public void creacion() {
		
		assertNotNull(sala);
		assertEquals(5, sala.getButacas()[0].length);
		assertEquals(7, sala.getButacas()[3].length);
	}
	
	@Test
	public void estaOcupadaTest() {
		assertFalse(sala.estaOcupada(0, 0));
		assertFalse(sala.estaOcupada(3, 6));
			}
	
	@Test
	public void ocuparButaca() {
		sala.ocuparButaca(0, 0);
		assertTrue(sala.estaOcupada(0,0));
	}
	
	@Test(expected = Error.class)
	public void ocuparDosVeces() {
		sala.ocuparButaca(0, 0);
		sala.ocuparButaca(0, 0);
	}
	
	@Test
	public void contarOcupadas() {
		sala.ocuparButaca(0, 0);
		assertEquals(1, sala.contarButacasOcupadas());
	}
}
