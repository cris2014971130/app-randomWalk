package proyectRandomWalk;

import java.util.ArrayList;

public class Main3 {
	
	//Se crean en este caso dos listas de numeros aleatorios, una en X y la otra da la posicion en Y
	ArrayList<Double> listAleatorioX;
	ArrayList<Double> listAleatorioY;
	
	public Main3() {
		//se inicializan las listas, tambien las posiciones en X y Y. Empieza el conteo del tiempo del proceso
		listAleatorioX= new ArrayList<>();
		listAleatorioY= new ArrayList<>();
		int posRanaX=0;
		int posRanaY=0;
		long inicio = System.currentTimeMillis();
		boolean isFind=false;
		int contador=0;
		double tiempo=0;
		int reintentos=0;
		//Se empieza el ciclo y se mantendra hasta que encuentre la posicion 250,300.
		while(isFind==false){
			listAleatorioX.add(Math.random());
			listAleatorioY.add(Math.random());
			if(listAleatorioX.get(contador)>0.5) {
				posRanaX++;
			}else {
				posRanaX--;
			}
			if(listAleatorioY.get(contador)>0.5) {
				posRanaY++;
			}else {
				posRanaY--;
			}
			System.out.println(posRanaX +","+posRanaY);
			if(posRanaX==250 && posRanaY==300) {
				System.out.println(posRanaX +","+posRanaY);
				isFind=true;
				 long fin = System.currentTimeMillis();
				//se calcula el tiempo que tomo la busqueda
				 tiempo = (double) ((fin - inicio)/1000);
			}
			if(posRanaX>1000|| posRanaX<-1000) {
				if(posRanaY>1000|| posRanaY<-1000) {
					posRanaX=0;
					posRanaY=0;
					reintentos++;
				}
			}
			contador++;
		}
		//Imprime por consola los saltos que le tomo a la rana para llegar, la posicion en la que quedo y el tiempo que le tomo
		System.out.println("La rana en "+ contador+ " movimientos llego hasta la posicion "+posRanaX+","+posRanaY
				+" y con un tiempo de " +tiempo);
	}
	
	public static void main(String[] args) {
		new Main3();
	}
}
