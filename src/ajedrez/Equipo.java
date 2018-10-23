package ajedrez;

import java.util.ArrayList;
import java.util.Random;

import pieza.Alfil;
import pieza.Caballo;
import pieza.Dama;
import pieza.Pieza;
import pieza.Rey;
import pieza.Torre;

public class Equipo {
	private String nombre;
	private Ajedrez ajedrez;
	private boolean estaEnJaque;
	private ArrayList<Pieza> piezas;

	/* Construcotres */
	public Equipo(String nombre) {
		this.ajedrez = ajedrez.getInstancia();
		this.nombre = nombre;
		this.piezas = new ArrayList<Pieza>();

	}

	public Pieza getRey() {
		int j = 0;
		for (int i = 0; i < this.piezas.size(); i++) {
			if (piezas.get(i) instanceof Rey) {
				j = i;
				break;
			}
		}
		return piezas.get(j);
	}

	/* Metodos */
	/*
	 * en esta primera instancia devolvemos un mnovimiento cualquiera de todos los
	 * disponibles para una pieza dada
	 */
	// TODO[a futuro ver de mejorar esta implementacion ]
	/* Metodos */
	/*
	 * en esta primera instancia devolvemos un mnovimiento cualquiera de todos los
	 * disponibles para una pieza dada
	 */
	// TODO[a futuro ver de mejorar esta implementacion ]
	public Jugada jugar() {
		ArrayList<Jugada> jugadas = new ArrayList<Jugada>();
		for (Jugada j : this.calcularJugadsPosibles()) {
			jugadas.add(j);
		}
		int i = jugadas.size();
		System.out.println(i);
		Random random = new Random(); // Instanciamos la clase Random
		int movimientoRandom = random.nextInt(jugadas.size()); // elegimos un movimiento al azar entre 0 y la cantidad
																// de movimientos posibles
		return jugadas.get(movimientoRandom); // devuelvo la jugada;
	}

	/* Retorna las jugadas posibles para una pieza dada (del arraylist) */
	public ArrayList<Jugada> calcularJugadsPosibles() {
		ArrayList<Jugada> jugadasPosibles = new ArrayList<Jugada>();// arraylist con las jugadas para una pieza en
																	// particular

		for (Pieza p : piezas) { // el array list de las piezas de un equipo
			Jugada jugada = new Jugada();
			for (Celda c : p.getMovimientosPosibles()) {
					jugada.setPieza(p);
					jugada.setFila(c.getFila());
					jugada.setColumna(c.getColumna());
					jugadasPosibles.add(jugada);
			}
			// jugadasPosibles=p.getMovimientosPosibles(); // por cada piza calculo sus
			// movimientos posibles y los asigno al ArrayList De Jugdas
		}
		return jugadasPosibles;
	}

	/* Geters y Seters */

	public Ajedrez getAjedrez() {
		return ajedrez;
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}

}