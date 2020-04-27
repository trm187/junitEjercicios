package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry {

	private int maxNumPasajeros;
	private double pesoMax;
	private int numTotalPasajeros;
	private int numTotalVehiculos;
	private double pesoTotal;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Ferry(double pesoT, double pesoM){
		this.pesoMax = pesoM;
		this.pesoTotal = pesoT;
	}
	
	public Ferry(int vTotal) {
		this.numTotalVehiculos = vTotal;
	}
	public boolean embarcarVehiculo(Vehiculo v) {
		this.numTotalVehiculos++;
		if(superadoMaximoVehiculos(v)) {
			this.numTotalVehiculos--;
			return false;
		}else {
			return vehiculos.add(v);
		}
	}
	
	public int totalVehiculos() {
		return this.numTotalVehiculos;
	}

	public boolean vacio() {
		if(this.numTotalVehiculos > 0) {
			return false;
		}else if(this.numTotalVehiculos < 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean superadoMaximoVehiculos(Vehiculo v) {
		this.pesoTotal = this.pesoTotal + v.getPesoConCarga();
		if(superadoMaximoPeso()) {
			this.pesoTotal = this.pesoTotal - v.getPesoConCarga();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean superadoMaximoPeso() {
		if(this.pesoTotal > this.pesoMax) {
			return true;
		}else {
			return false;
		}
	}
	
}
