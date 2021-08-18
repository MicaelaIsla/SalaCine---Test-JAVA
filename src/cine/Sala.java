package cine;

public class Sala {
	 private Butaca butacas [ ] [ ];
	
	public Sala(int butacasTot, int filas) {
		this.butacas = new Butaca[filas][];
		
		for(int i = 0; i < filas; i++) {
			int columnas = butacasTot / filas;
			
			if(i == (filas - 1)) {
				columnas += butacasTot % filas;
			}
			
			this.butacas[i] = new Butaca[columnas];
			
			this.inicializarButacas(i);
		}
	}
	
	public void inicializarButacas(int fila) {
		for(int i = 0; i < this.butacas[fila].length; i++) {
			this.butacas[fila][i] = new Butaca();
		}
	}
	
	public int contarButacasOcupadas() {
		int ocupadas = 0;
		for(Butaca[] fila : this.butacas) {
			for(Butaca butaca : fila) {
				if(butaca.estaOcupada()) ocupadas++;
			}
		}
		return ocupadas;
	}
	
	public boolean estaOcupada(int fila, int columna) {
		return this.butacas[fila][columna].estaOcupada();
	}
	
	public void ocuparButaca(int fila, int columna) {
		this.butacas[fila][columna].ocupar();
	}
	
	public Butaca[][] getButacas() {
		return this.butacas;
	}
}