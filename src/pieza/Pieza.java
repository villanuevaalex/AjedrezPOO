package pieza;


import java.util.ArrayList;
import ajedrez.Tablero;
import ajedrez.Ajedrez;
import ajedrez.Celda;
import ajedrez.Equipo;


 public abstract class Pieza implements IPieza {
	private Celda celda;
	private Equipo equipo;
	private boolean estaViva;
	private ArrayList<IPiezaListener> piezaListener;
	
	/*Constructores*/
	public Pieza() {
		
	}
	public Pieza(Celda celda, Equipo equipo) {
		this.equipo=equipo;
		this.celda=celda;
		this.estaViva= true;
	}
	
	/*Metodos*/
	public abstract ArrayList<Celda> getMovimientosPosibles();		
	
	public boolean validarMovimiento (int f, int c) {
		// devuelve verdadero si el moviemnto corresponde a una celda del tablero 
		if ((f>=0 && f<=7) && (c>=0 && c<=7)){
			return true;
		}		
		return false;
	}
	
	
	/*Geters y Seters*/
	public Celda getCelda() {
		return celda;
	}

	public void setCleda(Celda celda) {
		this.celda = celda;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public boolean getEstaViva() {
		return this.estaViva;
	}
	
	public void setEstaViva(boolean estaViva) {
		this.estaViva = estaViva;
	}
	
	public void addPiezaListener(IPiezaListener listener) {
		this.piezaListener.add(listener);
		
	}
	@Override
	public String toString() {
		String s="";
		if(this.equipo.getNombre()==Ajedrez.BLANCA) {
			s="B";
		}
		else {
			s="N";
		}
		return s;
	}
	
}
