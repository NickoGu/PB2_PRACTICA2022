package ar.edu.unlam.pb2;

public class Cliente implements Denunciable{

	Integer CUIT;
	Dispositivo dispositivo;
	String nombre;
	
	

	public Cliente(Integer cUIT, Dispositivo dispositivo, String nombre) {
		super();
		CUIT = cUIT;
		this.dispositivo = dispositivo;
		this.nombre = nombre;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Integer getCUIT() {
		return CUIT;
	}

	public void setCUIT(Integer cUIT) {
		CUIT = cUIT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
