package ajedrez;
import pieza.Pieza;

public class Celda {
	private int fila;
	private int columna;
	private Pieza pieza;
	
	/*Constructores*/
	public Celda(int fila, int columna) {
		this.fila= fila;
		this.columna= columna;
	}
	
	/*Metodos*/
	public boolean puedeIngresar(Pieza pieza) {
 		/* Esta celda puede tener o no una pieza
 		 * Devuelve un TRUE cuando si es pieza es del equipo contrario
		 * Devuelve un FALSE cuando si es pieza de nuestro equipo
		 * */
		if (this.getPieza() != null) {
			if (this.getPieza().getEquipo().getNombre() != pieza.getEquipo().getNombre()) {
				return true;
			}else {
				return false;
			}
		}
		return true;
	}
	public boolean estaOcupadaEquipoContrario(Equipo equipo) {
		/* Si el equipo pasado por parametro es distinto al equipo de pieza ubicado en la celda
		 * devuelve TRUE
		 * sino devuelve false
		 * si no hay pieza en la celda devuelve un false
		 * */
		
		if (this.getPieza() != null) {
			if (equipo.getNombre() != this.getPieza().getEquipo().getNombre()) {
				return true;
			}
		}
		return false;	
	}
	
	
	/*Geters y seters*/
	
	public int getFila() {
		return fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setFila(int fila) {
		this.fila=fila;
	}
	public void setColumna(int columna) {
		this.columna=columna;
	}
	public Pieza getPieza() {
		return pieza;
	}
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}
	
}
