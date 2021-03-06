package proyectRandomWalk;

import java.util.ArrayList;

public class Main4 {

	ArrayList<Double> listAleatorioX;
	ArrayList<Double> listAleatorioY;
	ArrayList<Double> listAleatorioZ;

	public Main4() {
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
		System.out.println("obteniendo resultado");
		while(isFind==false|| reintentos>=1){
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
			System.out.println(posRanaX +","+posRanaY+","+posRanaZ);
			if(posRanaX==45 && posRanaY==23 && posRanaZ==17) {
				isFind=true;
				long fin = System.currentTimeMillis();
				tiempo = (double) ((fin - inicio)/1000);
			}
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
		System.out.println("La rana en "+ contador+ " movimientos llego hasta la posicion "+posRanaX+","+posRanaY
				+" y con un tiempo de " +tiempo);
		System.out.println("y se realizaron "+reintentos+" reintots para lograr este resultado");
	}

	public static void main(String[] args) {
		new Main4();
	}
}
