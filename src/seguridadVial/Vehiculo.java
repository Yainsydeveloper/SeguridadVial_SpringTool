package seguridadVial;

public class Vehiculo {
	protected  String patente;
	protected String modelo;
	protected String color;
	protected int nroPasajeros;
	protected int velocidad;
	
	
	public Vehiculo(String patente, String modelo, String color, int nroPasajeros, int velocidad) {
		super();
		this.patente = patente;
		this.modelo = modelo;
		this.color = color;
		this.nroPasajeros = nroPasajeros;
		this.velocidad = velocidad;
	}

	public String getPatente() {
		return patente;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNroPasajeros() {
		return nroPasajeros;
	}

	public void setNroPasajeros(int nroPasajeros) {
		this.nroPasajeros = nroPasajeros;
	}
	
	
	

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", modelo=" + modelo + ", color=" + color + ", nroPasajeros="
				+ nroPasajeros + ", velocidad=" + velocidad + "]";
	}

	
	
	
	
	
}
