package ual.hmis.sesion06;

public final class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private double pesoConCarga;

	public Vehiculo(final double peso) {
		this.pesoConCarga = peso;
	}

	public double getPesoConCarga() {
		return this.pesoConCarga;
	}
}
