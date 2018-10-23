package ajedrez;


import pieza.Pieza;

public class Jugada {
	private Pieza pieza;
	private int fila;
	private int columna;

	/*Constructores*/
	public Jugada() {
		
	}
	public Jugada(Pieza pieza, int fila, int columna) {
		this.pieza = pieza;
		this.fila = fila;
		this.columna = columna;
	}
	/*Geters y Seters*/

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	
	
}
