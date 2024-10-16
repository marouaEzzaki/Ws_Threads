package tema1;

import java.util.Date;

public class Act_01_A extends Thread{
	
	private long num;
	
	public Act_01_A(long num) {
		this.num = num;
		
	}
	

	public static boolean esPrimo(long numero) { 
		boolean esPrimo=false;
		int contador0=0;
		
		for (int i=1;i<=numero;i++) {  
						
			if(numero%i==0) {
				contador0++;
			}
		}
		
		return contador0==2;
	}
	
	@Override 
	public void run() {
		
		System.out.println("Ejecutando el hilo : " + Thread.currentThread().getName());
		
		try {
			System.out.println("Esperando 2 segundos a arrancar los hilos... :), SO EXCITINGGG ...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Date inicial = new Date();
		System.out.println("\n"+num + " es primo ? : " + esPrimo(num));
		
		Date fin = new Date();
		
		double milisegundos = (fin.getTime() - inicial.getTime());
		
		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado en " + milisegundos +  " milisegundos");

		
	}
}