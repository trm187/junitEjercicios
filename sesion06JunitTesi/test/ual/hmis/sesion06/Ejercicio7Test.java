package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.ejercicio5.Alumno;

public class Ejercicio7Test {

	@ParameterizedTest (name = "{index} => Si nace en ({0}) se matricula en {1}")
	@CsvSource({
		"2017, 1º Educacion Infantil",
		"2016, 2º Educacion Infantil",
		"2015, 3º Educacion Infantil",
		"2014, 1º Educacion Primaria",
		"2013, 2º Educacion Primaria",
		"2012, 3º Educacion Primaria",
		"2011, 4º Educacion Primaria",
		"2010, 5º Educacion Primaria",
		"2009, 6º Educacion Primaria",
		"2008, 1º Educacion Secundaria",
		"2007, 2º Educacion Secundaria",
		"2006, 3º Educacion Secundaria",
		"2005, 4º Educacion Secundaria",
		"2004, Error",
		"2018, Error"
		
	})
	
	void testCursoSegunEdad(int input, String result) {
		//Arrange
		Alumno a1 = new Alumno();
		
		//Act
		//Assert
		assertEquals(a1.cursoSegunEdad(input), result);
	}
	
}
