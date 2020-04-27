package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) y ({1}) sale {2}")
	@CsvSource({
		
		"patata, pato, pat",
		"cadena, cadena, caden",
		"eh, ay, ''",
		"eeeh, aaah, h",
		"eeey, eeeh, e",
		"'', '', ''",
		", , ",
		", hola, ",
		"hola, , ",
		"'', hola, ''",
		"hola, '', ''"
	})
	
	void TestDevolverCaracteres(String cad1, String cad2, String resultado) {
		
		//Arrange
		Ejercicio4 e4 = new Ejercicio4();
		
		//Act
		//Assert
		assertEquals(e4.devolverCaracteres(cad1, cad2),resultado);
		
		
	}
	
}
