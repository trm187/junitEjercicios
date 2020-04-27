package ual.hmis.sesion06;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio5.Actividad;
import ual.hmis.sesion06.ejercicio5.Alumno;
import ual.hmis.sesion06.ejercicio5.Ejercicio;

public class Ejercicio5Test {

	@ParameterizedTest (name = "{index} => Para el string a buscar ({0}), el string de nuestra actividad clave ({1}) y un total de ({2}) ejercicios en la actividad "
	 		+ ", esperamos tener como nota ({3})")
	 @CsvSource({
			"actividad,actividad,4,20",
			"actividad,no,4,0",
			"actividad,actividad,0,0",
			"actividad,actividad,1,5"

		})
	 
	 
	 
	 
	void testCalcularNota(String nombreActividad, String otroname,int ejercicios, int expected) {
		Alumno al = new Alumno();
		ArrayList<Actividad> acts= new ArrayList<Actividad>();
		Actividad fea = new Actividad();
		fea.setNombre("noNombre");
		acts.add(fea);
		
		//for(int i = 0 ; i < actividades ; i++ ) {
			Actividad act = new Actividad();
			act.setNombre(otroname);
			ArrayList<Ejercicio> ejs= new ArrayList<Ejercicio>();
			
			for (int j = 0; j < ejercicios ; j++) {
				Ejercicio ej = new Ejercicio();
				ej.setPuntuacion(5);
				ejs.add(ej);
				
			}
			act.setEjercicios(ejs);
			acts.add(act);
			
		//}
			Actividad fea2 = new Actividad();
			fea2.setNombre("tampocoNombre");
			acts.add(fea2);	
		al.setActividadesAsignadas(acts);
		
		
		 assertEquals(expected, al.calcularNotaActividad(nombreActividad));
		
	 }
	
}
