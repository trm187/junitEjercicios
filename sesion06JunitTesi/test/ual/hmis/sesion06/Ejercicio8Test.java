package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio8Test {
	
	@ParameterizedTest (name = "{index} => Con peso ({0}) sale {1}")
	@CsvSource({
		
		"3, true",
		"2000, false",
		"1000, true",
		"1001, false"
	})
	
	void embarcarVehiculoTest(double input1, String result) {
		//Arrange
		Vehiculo v1 = new Vehiculo(input1);
		Ferry f1 = new Ferry(500, 1500);
		//Act
		//Assert
		assertEquals(f1.embarcarVehiculo(v1), Boolean.parseBoolean(result));
	}
	
	@ParameterizedTest (name = "{index} => Con ({0}) vehiculos, sale {1}")
	@CsvSource({
		
		"0, true",
		"2000, false",
		"-1, false"
	})
	
	void vacioTest(int input, String result){
		//Arrange
		Ferry f = new Ferry(input);
		//Act
		//Assert
		assertEquals(f.vacio(), Boolean.parseBoolean(result));
	}
	
	@ParameterizedTest (name = "{index} => ({0}) vehiculos")
	@CsvSource({
		
		"0",
		"2000",
		"-1"
	})
	
	void totalVehiculosTest(int input){
		//Arrange
		Ferry f = new Ferry(input);
		//Act
		//Arrange
		assertEquals(f.totalVehiculos(), input);
	}
	
}
