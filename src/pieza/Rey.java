package pieza;

import java.util.ArrayList;

import ajedrez.Celda;
import ajedrez.Equipo;
import ajedrez.Tablero;

public class Rey extends Pieza {

	
	public Rey(Celda celda,Equipo equipo) {
		super(celda,equipo);

	}

	@Override
	public void piezaMovida(Pieza pieza, Celda celdaOrigen, Celda celdaDestino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void piezaComida(Pieza pieza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Celda> getMovimientosPosibles() {
		ArrayList<Celda> listaCelda = new ArrayList<Celda>();
		Tablero tablero = this.getEquipo().getAjedrez().getTablero();// Tramos al tablero
		Celda mov = new Celda(0,0);
		for (int i = this.getCelda().getFila()-1; i < this.getCelda().getFila()+2; i++) {
			for (int j = this.getCelda().getColumna()-1; j < this.getCelda().getColumna()+2; j++) {
				if (validarMovimiento(i, j)) {
					mov = tablero.getCelda(i,j);
					if (mov.puedeIngresar(this)) {
						listaCelda.add(mov);
					}
				}
			}
		}
		return listaCelda;
	}
	
	public String toString() {
		return super.toString()+"R";
	}


	/*Geters y Seters*/
	

}
