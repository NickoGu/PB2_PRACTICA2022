package ar.edu.unlam.pb2;

public interface Alertable extends Monitoreable{

	public void marcarComoCasoSospechoso();
	public void confirmarSiFueFraude(Boolean fueFraude);
	
}
