package ual.hmis.sesion06;

import java.util.ArrayList;

public final class Ferry {

	private int maxNumPasajeros;
	private double pesoMax;
	private int numTotalPasajeros;
	private int numTotalVehiculos;
	private double pesoTotal;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public Ferry(final double pesoT, final double pesoM) {
		this.pesoMax = pesoM;
		this.pesoTotal = pesoT;
	}

	public Ferry(final int vTotal) {
		this.numTotalVehiculos = vTotal;
	}

	public boolean embarcarVehiculo(final Vehiculo v) {
		this.numTotalVehiculos++;
		if (superadoMaximoVehiculos(v)) {
			this.numTotalVehiculos--;
			return false;
		} else {
			return vehiculos.add(v);
		}
	}

	public int totalVehiculos() {
		return this.numTotalVehiculos;
	}

	public boolean vacio() {
		return this.numTotalVehiculos == 0;
	}

	public boolean superadoMaximoVehiculos(final Vehiculo v) {
		this.pesoTotal = this.pesoTotal + v.getPesoConCarga();
		if (superadoMaximoPeso()) {
			this.pesoTotal = this.pesoTotal - v.getPesoConCarga();
			return true;
		} else {
			return false;
		}
	}

	public boolean superadoMaximoPeso() {
		return this.pesoTotal > this.pesoMax;
	}

}
