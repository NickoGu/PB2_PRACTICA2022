package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Cliente;
import ar.edu.unlam.pb2.Dispositivo;
import ar.edu.unlam.pb2.Dispositivo_PC;


public class testParcial {

	@Test
	public void queSePuedaCrearUnCliente() {
		Dispositivo dispositivo = new Dispositivo_PC("Windows", 12345678, "Localidad");
		Cliente cliente = new Cliente(12345678, dispositivo, "Nico");
		
		assertNotNull(cliente);
		
		
	}

	@Test
	public void queSePuedaCrearUnDispositivo() {
		Dispositivo dispositivo = new Dispositivo_PC("Windows", 12345678, "Localidad");
		
		
		assertNotNull(dispositivo);
		
		
	}
	
}
