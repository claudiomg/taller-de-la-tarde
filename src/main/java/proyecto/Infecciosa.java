package proyecto;

public class Infecciosa {

	private int cantidadCelulasAmenazadas;

	public void setCantidadCelulasAmenazadas(int cantidadCelulasAmenazadas) {
		this.cantidadCelulasAmenazadas = cantidadCelulasAmenazadas;
	}

	public boolean esAgresiva(Persona unaPersona) {
		return this.cantidadCelulasAmenazadas > unaPersona.getCantidadDeCelulasTotales() * 0.1 ;	
	}

}
