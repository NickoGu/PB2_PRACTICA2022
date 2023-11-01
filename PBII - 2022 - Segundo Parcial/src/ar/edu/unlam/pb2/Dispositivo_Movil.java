package ar.edu.unlam.pb2;

public class Dispositivo_Movil extends Dispositivo {
	Integer IMEI;
	Boolean biometria;

	public Dispositivo_Movil(String sO, Integer iP, String localidad, Integer imei, Boolean biometria) {
		super(sO, iP, localidad);
		this.IMEI = imei;
		this.biometria = biometria;
	}

	public Integer getIMEI() {
		return IMEI;
	}

	public void setIMEI(Integer iMEI) {
		IMEI = iMEI;
	}

	public Boolean getBiometria() {
		return biometria;
	}

	public void setBiometria(Boolean biometria) {
		this.biometria = biometria;
	}

}
