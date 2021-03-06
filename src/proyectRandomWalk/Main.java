package proyectRandomWalk;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	int numVeces=0;
	static double P_SALTO= 0.5;
	ArrayList<Integer> posiciones;
	ArrayList<Double> probPos;
	int posInicial=0;

	public Main() {
		posiciones= new ArrayList<>();
		probPos = new ArrayList<>();
		solicitarInfo();
		int veces=1;
		for (int i = 0; i < numVeces; i++) {
				System.out.println(veces+" iteracion(es)		");
			moverRana();
			//moverRanaProb(veces);
			veces++;
		}
		mostrarPosiciones();
	}

	public void moverRana() {
		int tamanio= posiciones.size();
		if(tamanio!=0) {
			for (int i = 0; i < tamanio; i++) {
				int posAux = posiciones.get(i)+1;
				if(!posiciones.contains(posAux)) {
					posiciones.add(posAux);
				}
				posAux = posiciones.get(i)-1;
				if(!posiciones.contains(posAux)) {
					posiciones.add(posAux);
				}
				}
			for (int j = 0; j < tamanio; j++) {
				posiciones.remove(0);
			}
		}else {
			posiciones.add(posInicial+1);
			posiciones.add(posInicial-1);
		}
	}
	
	public void moverRanaProb(int numVecesAux) {
		int tamanio= posiciones.size();
		int tamanioAux = probPos.size();
		if(numVecesAux>1) {
			for (int i = 0; i < tamanio; i++) {
				probPos.add(calcularProbabilidad(numVecesAux,posiciones.get(i)));
			}
			for (int j = 0; j < tamanioAux; j++) {
				probPos.remove(0);
			}
		}else {
			probPos.add(P_SALTO);
			probPos.add(P_SALTO);
		}
	}

	public double calcularProbabilidad(int n, int y) {
		int combAux= (int)(P_SALTO*(n+y));
		double comb= combinatoria(n, combAux);
		double info= Math.pow(P_SALTO, n);
		return comb*info;
	}
	public void mostrarPosiciones() {
		for (int i = 0; i < posiciones.size(); i++) {
			if(posiciones.get(i)!=null) {
				System.out.println((i +1)+". "+posiciones.get(i)/*+"		"+probPos.get(i)*/);
			}
		}
	}
	
	public int combinatoria( double n , double r ){
			if( r == 0 || r == n)
				return 1;
			if( r > n)
				return 0;
			if(n<r) {
				return -1;
			}
			int a , b;
			a = combinatoria ( n - 1 , r -1 );
			b = combinatoria ( n - 1 , r );
			return a + b;
	}
	
	public void solicitarInfo() {
		numVeces = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos saltos desea que realice la rana?"));
	}

	public static void main(String[] args) {
		new Main();
	}
}
