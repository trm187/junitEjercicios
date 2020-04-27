package ual.hmis.sesion06;

public class Ejercicio3 {

	public String numeroAsterisco(int num) {
		String cadena = "";
		
		if(num < 0) {
			cadena = "número erróneo";
		}else if(num >=0 && num < 5) {
			cadena = "*****";
		}else if(num > 12) {
			cadena = "************";
		}else {
			for(int i = 0; i < num; i++) {
				cadena = cadena +"*";
			}
		}
		return cadena;
	}
	
}
