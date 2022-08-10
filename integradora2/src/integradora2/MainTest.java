package integradora2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MainTest {

	// Teste para ver se lan�a uma Exception ao exceder o limite semanal
	@Test
	void testException() {
		SerieProxy proxy = new SerieProxy();
		try
		{
			System.out.println(proxy.getSerie("Stranger Things"));
			System.out.println(proxy.getSerie("Sense 8"));
			System.out.println(proxy.getSerie("Lucifer"));
			System.out.println(proxy.getSerie("Sombra e Ossos"));
			System.out.println(proxy.getSerie("Law and Order SVU"));
		}
		catch(SerieNaoHabilitadaException e)
		{
			System.out.println(e);
		}
		
		// Aqui � para lan�ar uma exception
		SerieNaoHabilitadaException serieException = assertThrows(SerieNaoHabilitadaException.class, () -> proxy.getSerie("FBI"));
        assertEquals("Excede o n�mero de reprodu��es permitidas!", serieException.getMessage());
        System.out.println(serieException.getMessage());
	}

}
