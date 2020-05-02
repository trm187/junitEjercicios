package ual.hmis.sesion06.ejercicio5;

import java.util.ArrayList;

public final class Alumno {

//	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(final String nombre) {
//		this.nombre = nombre;
//	}

//	public ArrayList<Actividad> getActividadesAsignadas() {
//		return actividadesAsignadas;
//	}

	public void setActividadesAsignadas(final ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(final String nombreActividad) {
		double resultado = 0;
		for (Actividad act : actividadesAsignadas) {

			if (act.getNombre().equals(nombreActividad)) {

				ArrayList<Ejercicio> ejs = act.getEjercicios();
				for (Ejercicio ej : ejs) {
					resultado += ej.getPuntuacion();
				}

				act.setPuntuacionTotal(resultado);
				break;
			}

		}

		return resultado;
	}

	public String calificacion(final double nota) {
		String resultado = "";
		if (nota >= 0 && nota <= 4.9) {
			resultado = "Suspenso";
		} else if (nota >= 5 && nota <= 6.9) {
			resultado = "Aprobado";
		} else if (nota >= 7 && nota <= 8.9) {
			resultado = "Notable";
		} else if (nota >= 9 && nota <= 9.9) {
			resultado = "Sobresaliente";
		} else if (nota == 10) {
			resultado = "Matricula";
		} else {
			resultado = "Error en la nota";
		}
		return resultado;
	}

public String cursoSegunEdad(final int anyoNacimiento) {

		String resultado = "";

		if(anyoNacimiento == 2017) {
			resultado = "1º Educacion Infantil";
		} else if (anyoNacimiento == 2016) {
			resultado = "2º Educacion Infantil";
		} else if (anyoNacimiento == 2015) {
			resultado = "3º Educacion Infantil";
		} else if (anyoNacimiento == 2014) {
			resultado = "1º Educacion Primaria";
		} else if (anyoNacimiento == 2013) {
			resultado = "2º Educacion Primaria";
		} else if (anyoNacimiento == 2012) {
			resultado = "3º Educacion Primaria";
		} else if (anyoNacimiento == 2011) {
			resultado = "4º Educacion Primaria";
		} else if (anyoNacimiento == 2010) {
			resultado = "5º Educacion Primaria";
		} else if (anyoNacimiento == 2009) {
			resultado = "6º Educacion Primaria";
		} else if (anyoNacimiento == 2008) {
			resultado = "1º Educacion Secundaria";
		} else if (anyoNacimiento == 2007) {
			resultado = "2º Educacion Secundaria";
		} else if (anyoNacimiento == 2006) {
			resultado = "3º Educacion Secundaria";
		} else if (anyoNacimiento == 2005) {
			resultado = "4º Educacion Secundaria";
		} else {
			resultado = "Error";
		}
		return resultado;
	}
}
