package tema1;

public class Act_01_B_TAREA3 implements Runnable {

	String cadena;
	long num;

	public Act_01_B_TAREA3(String cadena, long num) {
		this.cadena = cadena;
		this.num = num;
	}

	public static void imprimir(String cadena, long num) {

		for (long i = 0; i < num; i++) {
			System.out.println(cadena);
		}

	}

	@Override
	public void run() {

		long tiempoInicio = System.nanoTime();

		imprimir(cadena, num);

		long tiempoFin = System.nanoTime();

		double tiempoSegundos = (tiempoFin - tiempoInicio) / 1_000_000_000.0;

		System.out.println("Tiempo de ejecución del HILO 3 : " + tiempoSegundos + " segundos");

	}

}
