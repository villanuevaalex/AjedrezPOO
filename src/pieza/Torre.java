package pieza;

import java.util.ArrayList;
import ajedrez.*;

public class Torre extends Pieza {

	
	/*Constructores*/


	public Torre(Celda celda,Equipo equipo) {
		super(celda,equipo);
		
		
	}
	
/*Metodos*/
	@Override
	public ArrayList<Celda> getMovimientosPosibles() {
		ArrayList<Celda> listaCelda = new ArrayList<Celda>();
		Celda c = this.getCelda();//Celda origen donde esta la pieza actualmente
		Tablero tablero= this.getEquipo().getAjedrez().getTablero(); // traemos el tablero 
		movimiento(c,tablero, listaCelda, -1, 0); //NORTE
		movimiento(c,tablero, listaCelda, +1, 0); //SUR
		movimiento(c,tablero, listaCelda, 0, +1); //ESTE
		movimiento(c,tablero, listaCelda, 0, -1); //OESTE
		
		return listaCelda;
	}
	
	private void movimiento (Celda c, Tablero tablero, ArrayList<Celda> listaCelda, int fila, int columna) {
		/* Se enlistan las celdas posibles segun los movimientos d la torre
		 * si en fila viene un +1 y culumna 0 significa movimiento SUR
		 * si en fila viene un -1 y culumna 0 significa movimiento NORTE
		 * si en columna viene un +1 y fila 0 significa movimiento ESTE
		 * si en columna viene un -1 y fila 0 significa movimiento OESTE
		 * */
		
		boolean sePuede = true;
		Celda mov = new Celda(0,0);
		while (sePuede) {//ESTE
			sePuede = this.validarMovimiento(c.getFila() + fila, c.getColumna() + columna);//Controla si esta dentro del tablero
			if (sePuede) {
				mov = tablero.getCelda(c.getFila() + fila, c.getColumna() + columna);//Celda a donde se avanza
				sePuede = mov.puedeIngresar(this);//Controla si puede avanzar a esa celda
				if (sePuede) {
					listaCelda.add(mov);
					//Consultamos si la celda a donde apunta hay un enemigo para comer
					if (tablero.getCelda(mov.getFila(), mov.getColumna()).estaOcupadaEquipoContrario(this.getEquipo()))  {
						sePuede = false; //Si hay un enemigo, se para la trayectoria de la torre
					}
				}
			}
			if (columna != 0) 
				columna = columna + columna;
			if (fila != 0)
				fila = fila + fila;
		}
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
		return super.toString()+"T";
	}
}