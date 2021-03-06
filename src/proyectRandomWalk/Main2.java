package proyectRandomWalk;

import javax.swing.JOptionPane;

public class Main2 {
	
	double[] listAleatorio;
	
	
	public Main2() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos movimientos hara la ranita?"));
		listAleatorio= new double[cantidad];
		int posRana=0;
		for (int i = 0; i < listAleatorio.length; i++) {
			listAleatorio[i]= Math.random();
			if(listAleatorio[i]>0.5) {
				posRana++;
			}else {
				posRana--;
			}
			System.out.println((i+1)+". "+posRana);
		}
		System.out.println("La rana en "+ cantidad+ " movimientos llego hasta la posicion "+posRana);
	}
	
	public static void main(String[] args) {
		new Main2();
	}
 }
