package ajedrez;

import pieza.Pieza;

public interface IJuegoListener {
	boolean equipoEnJaque(Equipo equipo);
	void turnoActual(Equipo equipo);
	void piezaComida(Pieza pieza);
	void JuegoIniciado();
	void juegoFinalizado();

}
