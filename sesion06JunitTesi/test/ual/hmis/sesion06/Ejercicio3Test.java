package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({
		
		"-1, número erróneo",
		"0, *****",
		"3, *****",
		"5, *****",
		"7, *******",
		"15, ************"
	})
	
	
	void testNumeroAsterisco(int num, String result) {
		//Arrange
		Ejercicio3 e3 = new Ejercicio3();
		//Act
		//Assert
		assertEquals(e3.numeroAsterisco(num), result);
		
	}
}
