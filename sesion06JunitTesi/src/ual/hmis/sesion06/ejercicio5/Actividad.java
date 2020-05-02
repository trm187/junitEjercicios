package ual.hmis.sesion06.ejercicio5;

import java.util.ArrayList;

public final class Actividad {

	private String nombre; // nombre de la actividad
	private ArrayList<Ejercicio> ejercicios;
	private boolean apta;
	private double puntuacionTotal;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ejercicio> getEjercicios() {
		return ejercicios;
	}

	public void setEjercicios(final ArrayList<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}
//
//	public boolean isApta() {
//		return apta;
//	}
//
//	public void setApta(boolean apta) {
//		this.apta = apta;
//	}

//
//	public double getPuntuacionTotal() {
//		return this.puntuacionTotal;
//	}

	public void setPuntuacionTotal(final double value) {
		this.puntuacionTotal = value;
	}

//	public void agregarEjercicioCalificado(
//	String nombreEjercicio, double puntuacion) {
//
//		Ejercicio nuevoEjercicio = new Ejercicio();
//
//		nuevoEjercicio.setNombre(nombreEjercicio);
//		nuevoEjercicio.setPuntuacion(puntuacion);
//
//		ejercicios.add(nuevoEjercicio);
//	}

}
