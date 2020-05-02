package ual.hmis.sesion06;

public final class Ejercicio3 {

	private static final int CINCO = 5;
	private static final int DOCE = 12;
	public String numeroAsterisco(final int num) {
		String cadena = "";

		if (num < 0) {
			cadena = "número erróneo";
		} else if (num >= 0 && num < CINCO) {
			cadena = "*****";
		} else if (num > DOCE) {
			cadena = "************";
		} else {
		 	for (int i = 0; i < num; i++) {
				cadena = cadena + "*";
			}
		}
		return cadena;
	}

}
