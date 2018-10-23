package pieza;
import ajedrez.Celda;

public interface IPieza {
	void piezaMovida(Pieza pieza,Celda celdaOrigen,Celda celdaDestino);
	void piezaComida(Pieza pieza);

}
