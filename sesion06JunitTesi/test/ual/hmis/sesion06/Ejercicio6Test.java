package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio5.Alumno;

public class Ejercicio6Test {

	@ParameterizedTest (name = "{index} => Con nota ({0}) se califica {1}")
	@CsvSource({
		
		"3, Suspenso",
		"2, Suspenso",
		"3.14, Suspenso",
		"6.45, Aprobado",
		"7.3, Notable",
		"5.8, Aprobado",
		"8.7, Notable",
		"9.7, Sobresaliente",
		"10, Matricula",
		"-1, Error en la nota",
		"11, Error en la nota",
		"0, Suspenso",
		"4.9, Suspenso",
		"5, Aprobado",
		"6.9, Aprobado",
		"7, Notable",
		"8.9, Notable",
		"9, Sobresaliente",
		"9.9, Sobresaliente"
	})
	
	void testCalificacion(double input, String result) {
		//Arrange
		Alumno a1 = new Alumno();
		
		//Act
		//Arrange
		
		assertEquals(a1.calificacion(input), result);
		
	}
	
}
