package ar.edu.unlam.pb2;

public abstract class Dispositivo {
	String SO;
	Integer IP;
	String localidad;

	public Dispositivo(String sO, Integer iP, String localidad) {
		super();
		SO = sO;
		IP = iP;
		this.localidad = localidad;
	}

	public String getSO() {
		return SO;
	}

	public void setSO(String sO) {
		SO = sO;
	}

	public Integer getIP() {
		return IP;
	}

	public void setIP(Integer iP) {
		IP = iP;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
