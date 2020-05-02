package ual.hmis.sesion06;

public final class Ejercicio2 {

	private static final int TREINTA = 30;

	public boolean login(final String username, final String password) {
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty()) {
			return false;
		}
		// comprobar que la longitud sea < 30
		if (username.length() >= TREINTA
				|| password.length() >= TREINTA) {
			return false;
		}
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);

	}

	public boolean compruebaLoginEnBD(final String username,
			final String password) {
		// método mock (simulado)
		return username.equals("user") && password.equals("pass");
	}
}
