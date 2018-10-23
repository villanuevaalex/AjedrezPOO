package pieza;

import java.util.ArrayList;

import ajedrez.Celda;
import ajedrez.Equipo;
import ajedrez.Tablero;

public class Caballo extends Pieza{
	
	/*Constructores*/
	
	public Caballo(Celda celda,Equipo equipo) {
		super(celda,equipo);
		
	}
	/*Metodos*/
	public ArrayList<Celda> getMovimientosPosibles() {
		ArrayList<Celda> listaCelda = new ArrayList<Celda>();
		Celda c = this.getCelda();//Celda origen donde esta la pieza actualmente
		Tablero tablero = this.getEquipo().getAjedrez().getTablero();// Tramos al tablero
		Celda mov = new Celda(0,0); //Celda destinada a los posibles movimientos del caballo
		int origen = c.getColumna() + c.getFila(); //Sumatoria de las coordenadas origen de la celda
		boolean filaColumnaDistinta;
		//Se recorre la porcion de tablero donde se puede desplazar el caballo
		int j =2;
		for (int i = 1; i < 3; i++) {
			if (validarMovimiento(c.getFila() + i, c.getColumna() + j)) {//Si esta dentro del tablero
				mov = tablero.getCelda(c.getFila() + i, c.getColumna() + j);
				if (mov.puedeIngresar(this)) {
					listaCelda.add(mov);
				}	
			}
			if (validarMovimiento(c.getFila() - i, c.getColumna() - j)) {//Si esta dentro del tablero
				mov = tablero.getCelda(c.getFila() - i, c.getColumna() - j);
				if (mov.puedeIngresar(this)) {
					listaCelda.add(mov);
				}
			}
			if (validarMovimiento(c.getFila() - j, c.getColumna() + i)) {//Si esta dentro del tablero
				mov = tablero.getCelda(c.getFila() - j, c.getColumna() + i);
				if (mov.puedeIngresar(this)) {
					listaCelda.add(mov);
				}
			}
			if (validarMovimiento(c.getFila() + j, c.getColumna() - i)) {//Si esta dentro del tablero
				mov = tablero.getCelda(c.getFila() + j, c.getColumna() - i);
				if (mov.puedeIngresar(this)) {
					listaCelda.add(mov);
				}
			}
			j--;
		}
		return listaCelda;
	}

	@Override
	public void piezaMovida(Pieza pieza, Celda celdaOrigen, Celda celdaDestino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void piezaComida(Pieza pieza) {
		// TODO Auto-generated method stub
		
	}


	public String toString() {
		return super.toString()+"C";
	}

	
}
