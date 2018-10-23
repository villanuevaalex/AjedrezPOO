package ajedrez;

import util.Esperar;
import util.uAjedrez;
import pieza.Alfil;
import pieza.Caballo;
import pieza.Dama;
import pieza.Peon;
import pieza.Rey;
import pieza.Torre;

import java.util.Scanner;

import pieza.*;

public class Ajedrez {
	public static final String BLANCA ="Blanca";
	public static final String NEGRA = "Negra";
	private Tablero tablero; 
	private Equipo blancas;
	private Equipo negras;
	private static Ajedrez instancia = new Ajedrez();// singletone 
/*Geters y Seters*/
	private Ajedrez() {
		
	}
	
	public static Ajedrez getInstancia() {
		return instancia;
	}
	public void inicarJuego() {
		/**
		 * @author carlos
		 * @param
		 * Inicializa El tablero, se crea el tablero y los equipos
		 * 
		 */
		//Tablero tablero= new Tablero();
		this.tablero= new Tablero();
		this.tablero.crear();
		this.blancas= new Equipo(BLANCA); 
		this.crearPiezas(this.blancas);
		this.negras= new Equipo(NEGRA);
		this.crearPiezas(this.negras);
		this.mostrarTablero();
	}
	
	private void crearPiezas(Equipo equipo) {
		/*defino las celdas con sus piezas y a las piezas les defino una celda inicial*/
		if (equipo.getNombre()==BLANCA) {
			uAjedrez.crearPiezasBlancas(this.tablero,equipo);
			
		} else {
			uAjedrez.crearPiezasNegras(this.tablero,equipo);
			
		}
	
		}
		public void mostrarTablero() {
			uAjedrez.mostrarTablero(this.tablero);
		}
		
		public Tablero getTablero() {
			return this.tablero;
		}
		
				
	/*Doy Los Turnos A los equipos*/
	/* Antes de comenzar el juego lo debo de iniciar
	 */
		public void comenzar () {
		while(!this.esFinJuego(blancas,negras)) {
			uAjedrez.darTurnos(this.blancas,tablero);
			Esperar.esprerar();
			if (!this.esFinJuego(negras,blancas)) {
				uAjedrez.darTurnos(this.negras,tablero);
				Esperar.esprerar();
			}
		}
	}

	

	private boolean esFinJuego(Equipo equipo1, Equipo equipo2) {
		
		
		if ((equipo1.getRey().getEstaViva()) && (equipo2.getRey().getEstaViva())) {
			return false;
		}
		return true;
	}
				
	} 
