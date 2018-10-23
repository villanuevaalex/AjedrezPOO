package ajedrez;

import java.util.ArrayList;
import java.util.Arrays;

import pieza.*;

public class Tablero {

	public Celda[][] celda;

	/* Metodos */
	public Tablero() {
		this.celda = new Celda[8][8];
	}

	public void crear() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Celda c = new Celda(i, j);
				celda[i][j] = c;
			}

		}
	}

	public Celda getCelda(int fila, int columna) {
		return this.celda[fila][columna];
	}

	public void mover(Pieza pieza, int fila, int columna) {

		//if (pieza instanceof Peon) {
			/* Esto se puede hacer si la jugada es posible
			 * 
			 * */
			this.celda[pieza.getCelda().getFila()][pieza.getCelda().getColumna()].setPieza(null);// se elimina la pieza de la celda
			pieza.setCleda(this.celda[fila][columna]);
			this.celda[fila][columna].setPieza(pieza);// Se coloca la pieza que se manda por parametro
			
			
			/*
			 * pieza.getCelda().setFila(fila);// Se relaciona la celda de la pieza con la fila actual
			
			pieza.getCelda().setColumna(columna);// Se relaciona la celda de la pieza con la columna actual
			 * */
			
			

		/*
		 * Primero tenemos que borrar la pieza de su celda de origen Despues colocar la
		 * pieza en el destino
		 */

	}

	public ArrayList<Pieza> quienesMatan(Pieza pieza) {
		return null; // aqui devuelvo la pieza que matan
	}

	public void getPieza(Equipo equipo) {
		// devolver la pieza del equipo
	}

	public void limpiar() {
		// refresco la pantalla
	}

	@Override
	public String toString() {
		for (int i = 0; i < 8; i++) {
			System.out.println("----------------------------------------------------------"+"\t");
			for (int j = 0; j < 8; j++) {
				
				if (this.celda[i][j].getPieza() != null) {
					if (this.celda[i][j].getPieza().getEstaViva()) {
						System.out.print(this.celda[i][j].getPieza() + "\t");
					} else {
						System.out.print(" "+ "\t");
					}
				}else {
					System.out.print(" "+ "\t");
				}

			}
			System.out.println("\n");
		
		}
		System.out.println("----------------------------------------------------------"+"\t");
		return String.format("");
	}

}
