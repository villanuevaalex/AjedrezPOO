package pieza;

import java.util.ArrayList;

import ajedrez.*;


public class Peon extends Pieza {
	// private boolean esPrimerMovimiento; podriamos tener una varaible es primer movimneto y en base a esa preguntamos para hacer la comparacion 
	
	
	/*Constructores*/

	public Peon(Celda celda,Equipo equipo) {
		super(celda,equipo);
	}
	
	/*Metodos*/
	@Override
	public ArrayList<Celda> getMovimientosPosibles() {
		ArrayList<Celda> listaCelda = new ArrayList<Celda>();
		Tablero tablero = this.getEquipo().getAjedrez().getTablero();// Tramos al tablero
		int f1, f2;
		if(this.getEquipo().getNombre()=="Blanca") {
			f2 = -2;
			f1 = -1;
		} else {
			f2 = 2;
			f1 = 1;
		}
		//Movimiento Normal de a una celda
		if (validarMovimiento(this.getCelda().getFila() + f1, this.getCelda().getColumna())) {//Validamos que este dentro del tablero
			if (tablero.getCelda(this.getCelda().getFila() + f1, this.getCelda().getColumna()).puedeIngresar(this)) {//Validamos si puede ingresar la celda
				listaCelda.add(new Celda(this.getCelda().getFila() + f1, this.getCelda().getColumna()));
				//Movimiento de Primer Movimiento de a dos celdas
				if ((this.getCelda().getFila() == 1) || (this.getCelda().getFila()==6)) {//POreguntamos si es su primer movimiento
					if (validarMovimiento(this.getCelda().getFila() + f2, this.getCelda().getColumna())) {//idem
						if (tablero.getCelda(this.getCelda().getFila() + f2, this.getCelda().getColumna()).puedeIngresar(this)) {//idem
							listaCelda.add(new Celda(this.getCelda().getFila() + f2, this.getCelda().getColumna()));
						}
					}
				}
			}
		}
		
		return listaCelda;
	}
	
	
	@Override
	public void piezaMovida(Pieza pieza, Celda celdaOrigen, Celda celdaDestino) {
	//		this.getMovimientosPosibles();
		
	}
	@Override
	public void piezaComida(Pieza pieza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return super.toString()+"P";
	}
	


}
