import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteData {

	static Data data;
	
	@BeforeAll
	public static void criaData() {
		data = new Data("13/07/2026");
	}
	
	@Test
	public void testaData() {
		assertEquals("13/07/2026", data.getData());
	}
	
	@Test
	public void testaDia() {
		assertEquals(13, data.getDia());
	}
	
	@Test
	public void testaMes() {
		assertEquals(07, data.getMes());
	}
	
	@Test
	public void testaAno() {
		assertEquals(2026, data.getAno());
	}
}
