package proyectRandomWalk;

import javax.swing.JOptionPane;

public class Main2 {
	
	//se crea la lista de numeros aleatorios
	double[] listAleatorio;
	
	
	//constructor que solicitara la cantidad de movimientos de la rana
	public Main2() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"żCuantos movimientos hara la ranita?"));
		listAleatorio= new double[cantidad];
		int posRana=0;
		for (int i = 0; i < listAleatorio.length; i++) {
			//Se obtendra un número aleatorio y dependiendo de si es mayor o menor la probabilidad retrocedera o 
			//avanzara la rana. Y dicha posición se mostrara en consola.
			listAleatorio[i]= Math.random();
			if(listAleatorio[i]>0.5) {
				posRana++;
			}else {
				posRana--;
			}
			System.out.println((i+1)+". "+posRana);
		}
		//cuando termine el ciclo de saltos que se realice, mostrara la posición en la cual quedo dicha 
		//rana
		System.out.println("La rana en "+ cantidad+ " movimientos llego hasta la posicion "+posRana);
	}
	
	public static void main(String[] args) {
		new Main2();
	}
 }
