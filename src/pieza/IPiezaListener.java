package pieza;

import java.util.ArrayList;

import ajedrez.Celda;

public interface IPiezaListener {
	public void piezaMovida(Pieza pieza,Celda celda1,Celda celda2);
	public void piezaComida(Pieza pieza);
}
