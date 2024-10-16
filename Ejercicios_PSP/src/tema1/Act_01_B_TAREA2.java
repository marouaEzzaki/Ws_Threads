package tema1;

import java.util.Date;

public class Act_01_B_TAREA2 extends Thread {

	long num;

	public Act_01_B_TAREA2(long num) {
		this.num = num;
	}

	public static void mostrarNumeros(long num) {

		for (long i = num; i <= 1000000000; i++) {
			System.out.println(i);
		}

	}

	@Override
	public void run() {
		double segundos = 0;

		//Date antes = new Date();

		 long tiempoInicio = System.nanoTime();
		
		mostrarNumeros(num);

		//Date despues = new Date();
        long tiempoFin = System.nanoTime();

		//segundos = (despues.getTime() - antes.getTime()) / 1000;

		System.out.println("\nHa tardado el hilo 2  " + segundos + " segundos");
		
		double tiempoSegundos = (tiempoFin - tiempoInicio) / 1_000_000_000.0;

        System.out.println("Tiempo de ejecución del HILO 2 : " + tiempoSegundos + " segundos");
  

	}
}