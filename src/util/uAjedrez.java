package util;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.TableView.TableRow;

import ajedrez.*;
import pieza.*;

public abstract class uAjedrez {
			Tablero tablero;
		
	public static void crearPiezasNegras(Tablero tablero,Equipo equipo){
		/*Creo Las Torres*/
		tablero.getCelda(0,0).setPieza(new Torre(tablero.getCelda(0,0),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,0).getPieza());
		tablero.getCelda(0,7).setPieza(new Torre(tablero.getCelda(0,7),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,7).getPieza());
		/*Creo Los Caballos*/
		tablero.getCelda(0,1).setPieza(new Caballo(tablero.getCelda(0,1),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,1).getPieza());
		tablero.getCelda(0,6).setPieza(new Caballo(tablero.getCelda(0,6),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,6).getPieza());
		/*Crelo Los Alfiles*/
		tablero.getCelda(0,2).setPieza(new Alfil(tablero.getCelda(0,2),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,2).getPieza());
		tablero.getCelda(0,5).setPieza(new Alfil(tablero.getCelda(0,5),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,5).getPieza());
		/*Creo El Rey*/
		tablero.getCelda(0,3).setPieza(new Rey(tablero.getCelda(0,3),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,3).getPieza());
		/*Creo la Dama*/
		tablero.getCelda(0,4).setPieza(new Dama(tablero.getCelda(0,4),equipo));
		equipo.getPiezas().add(tablero.getCelda(0,4).getPieza());
		/*Creo Los Peones*/
		for(int i=0;i<8;i++) {
			tablero.getCelda(1,i).setPieza(new Peon(tablero.getCelda(1,i),equipo));
			equipo.getPiezas().add(tablero.getCelda(1,i).getPieza());
		}
	}
	
	public static void crearPiezasBlancas(Tablero tablero,Equipo equipo){
		for(int i=0;i<8;i++) {
			tablero.getCelda(6,i).setPieza(new Peon(tablero.getCelda(6,i),equipo));
			equipo.getPiezas().add(tablero.getCelda(6,i).getPieza());
		}
		/*Creo Las Torres*/
		tablero.getCelda(7,0).setPieza(new Torre(tablero.getCelda(7,0),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,0).getPieza());
		tablero.getCelda(7,7).setPieza(new Torre(tablero.getCelda(7,7),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,7).getPieza());
		
		/*Creo Los Caballos*/
		tablero.getCelda(7,1).setPieza(new Caballo(tablero.getCelda(7,1),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,1).getPieza());
		tablero.getCelda(7,6).setPieza(new Caballo(tablero.getCelda(7,6),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,6).getPieza());
		/*Crelo Los Alfiles*/
		tablero.getCelda(7,2).setPieza(new Alfil(tablero.getCelda(7,2),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,2).getPieza());
		tablero.getCelda(7,5).setPieza(new Alfil(tablero.getCelda(7,5),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,5).getPieza());
		/*Creo El Rey*/
		tablero.getCelda(7,3).setPieza(new Rey(tablero.getCelda(7,3),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,3).getPieza());
		/*Creo la Dama*/
		tablero.getCelda(7,4).setPieza(new Dama(tablero.getCelda(7,4),equipo));
		equipo.getPiezas().add(tablero.getCelda(7,4).getPieza());
		
	}	
		public static void darTurnos(Equipo equipo, Tablero tablero) {
			
			Jugada jugada= equipo.jugar();	
			tablero.mover(jugada.getPieza(),jugada.getFila(),jugada.getColumna());
			//System.out.println("Turno Del Equipo: "+equipo.getNombre());
			uAjedrez.mostrarTablero(tablero);
		}
		
		
		private static void mostrarJugada(Jugada jugada) {
			
		}
		
		private static void verificarEstadoJuego(Equipo equipo) {
			
		}
		public static void mostrarTablero(Tablero tablero) {
			
				System.out.print(tablero);
		
			}
		}

		
		


