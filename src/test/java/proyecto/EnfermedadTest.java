package proyecto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EnfermedadTest {

	Infecciosa malaria = new Infecciosa();
	Persona frank = new Persona();		

	@Before
	public void inicializarEscenario(){
		frank.setCantidadCelulasTotales(1000);		
	}
	
	@Test
	public void unaEnfermedadInfecciosaEsAgresiva(){
		malaria.setCantidadCelulasAmenazadas(101);
		boolean esAgresiva = malaria.esAgresiva(frank);
		Assert.assertTrue(esAgresiva);
	}
	
}
