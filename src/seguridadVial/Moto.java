package seguridadVial;

public class Moto extends Vehiculo {

	private int nroEspejos;

	public Moto(String patente, String modelo, String color, int nroPasajeros, int velocidad, int nroEspejos) {
		super(patente, modelo, color, nroPasajeros, velocidad);
		this.nroEspejos = nroEspejos;
	}

	public int getNroEspejos() {
		return nroEspejos;
	}

	public void setNroEspejos(int nroEspejos) {
		this.nroEspejos = nroEspejos;
	}

	@Override
	public String toString() {
		return "Moto [nroEspejos=" + nroEspejos + ", patente=" + patente + ", modelo=" + modelo + ", color=" + color
				+ ", nroPasajeros=" + nroPasajeros + ", velocidad=" + velocidad + "]";
	}


	

}
