package ual.hmis.sesion06;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private double pesoConCarga;
	
	public Vehiculo(double peso) {
		this.pesoConCarga = peso;
	}
	
	public double getPesoConCarga() {
		return this.pesoConCarga;
	}
}
