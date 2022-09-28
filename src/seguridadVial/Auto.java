package seguridadVial;

public class Auto extends Vehiculo {
	
	private boolean ruedaAuxilio;
	
	
	public Auto(String patente, String modelo, String color, int nroPasajeros, int velocidad, boolean ruedaAuxilio) {
		super(patente, modelo, color, nroPasajeros, velocidad);
		this.ruedaAuxilio = ruedaAuxilio;
	}
	
	

	public boolean isRuedaAuxilio() {
		return ruedaAuxilio;
	}



	public void setRuedaAuxilio(boolean ruedaAuxilio) {
		this.ruedaAuxilio = ruedaAuxilio;
	}

	

	@Override
	public String toString() {
		return "Auto [ruedaAuxilio=" + ruedaAuxilio + ", patente=" + patente + ", modelo=" + modelo + ", color=" + color
				+ ", nroPasajeros=" + nroPasajeros + "]";
	}


	

}
