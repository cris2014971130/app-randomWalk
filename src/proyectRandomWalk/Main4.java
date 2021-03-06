package proyectRandomWalk;

import java.util.ArrayList;

public class Main4 {
	//se crean ahora tres listas, una para posicion en X, otra en Y, y la otra en Z.
	ArrayList<Double> listAleatorioX;
	ArrayList<Double> listAleatorioY;
	ArrayList<Double> listAleatorioZ;

	public Main4() {
		//se inicializan las listas y las posiciones. Se toma el tiempo de inicio del proceso
		listAleatorioX= new ArrayList<>();
		listAleatorioY= new ArrayList<>();
		listAleatorioZ= new ArrayList<>();
		int posRanaX=0;
		int posRanaY=0;
		int posRanaZ=0;
		long inicio = System.currentTimeMillis();
		boolean isFind=false;
		int contador=0;
		double tiempo=0;
		int reintentos=0;
		int cumplio=0;
		//al igual que el anterior se solicita el numero aleatorio y dependiendo de la probabilidad aumenta o disminuye su posición
		while(isFind==false){
			listAleatorioX.add(Math.random());
			listAleatorioY.add(Math.random());
			listAleatorioZ.add(Math.random());
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
			if(listAleatorioZ.get(contador)>0.5) {
				posRanaZ++;
			}else {
				posRanaZ--;
			}
			//Imprime la posición en la que se encuentra la rana. Y cuando la encuentra calcula el tiempo tardado
			System.out.println(posRanaX +","+posRanaY+","+posRanaZ);
			if(posRanaX==45 && posRanaY==23 && posRanaZ==17) {
				isFind=true;
				long fin = System.currentTimeMillis();
				tiempo = (double) ((fin - inicio)/1000);
			}
			//este if le pone un limite a los pasos para que no se alejen demasiado del punto solicitado.
			//Eso evita que la memoria RAM se llene sin llegar a encontrarlo
			if(posRanaX>50|| posRanaX<-50) {
				posRanaX=0;
			}
			if(posRanaY>50|| posRanaY<-50) {
				posRanaY=0;
			}
			if(posRanaZ>50||posRanaZ<-50) {
				posRanaZ=0;
				
			}
			if(cumplio>=3) {
				reintentos++;
			}
			contador++;
		}
		//Al final muestra los saltos que hizo la rana y la posicion en la que quedo
		System.out.println("La rana en "+ contador+ " movimientos llego hasta la posicion "+posRanaX+","+posRanaY
				+" y con un tiempo de " +tiempo);
	}

	public static void main(String[] args) {
		new Main4();
	}
}
