package seguridadVial;



public class Conductor {
	private int dni;
	private boolean licenciaConducir;
	private Auto Auto;
	private Moto Moto;
	
	
	public Conductor(int dni, boolean licenciaConducir,Auto Auto) {
		super();
		this.dni = dni;
		this.licenciaConducir = licenciaConducir;
		this.Auto = Auto;
	}


	public Conductor(int dni, boolean licenciaConducir, Moto Moto) {
		super();
		this.dni = dni;
		this.licenciaConducir = licenciaConducir;
		this.Moto = Moto;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public boolean isLicenciaConducir() {
		return licenciaConducir;
	}


	public void setLicenciaConducir(boolean licenciaConducir) {
		this.licenciaConducir = licenciaConducir;
	}


	public Auto getAuto() {
		return Auto;
	}


	public void setAuto(Auto auto) {
		this.Auto = auto;
	}


	public Moto getMoto() {
		return Moto;
	}


	public void setMoto(Moto Moto) {
		this.Moto = Moto;
	}


	@Override
	public String toString() {
		return "Conductor [dni=" + dni + ", licenciaConducir=" + licenciaConducir + ", Auto=" + Auto + ", Moto=" + Moto
				+ "]";
	}




	
	
	
}
