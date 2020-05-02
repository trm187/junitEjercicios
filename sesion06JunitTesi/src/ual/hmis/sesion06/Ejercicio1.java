package ual.hmis.sesion06;

public final class Ejercicio1 {

	private static final int TRES = 3;
	private static final int CINCO = 5;

	/*
	 * Método transformar
	 */
	public int transformar(final int x) {
		int resultado = 0;
		if (x % 2 == 0) {
			resultado = transformar(x / 2);
		} else if (x % TRES == 0) {
			resultado = transformar(x / TRES);
		} else if (x % CINCO == 0) {
			resultado = transformar(x / CINCO);
		} else {
			return x;
		}
		return resultado;
	}
}
