package _01_basico;

//Una manera de crear hilos en java, es extendiendo de
//la clase Thread que ya está implementada en la JDK
public class _01_HiloThread extends Thread {

	private String valorImprimir;

	// String name
	public _01_HiloThread(String valorImprimir) {
		this.valorImprimir = valorImprimir; //se crea el "parametro aquí"
	}

	// Una vez que arranquemos el hilo, inmediatamente después ejecutará el 
	// método "run". Un hilo siempre se debe arrancar con el método "start"
	// que esta implementado en la clase Tread, y será este el que llame a su
	// vez al método "run"
	// Este método lo podemos entender como un "main"
	// La ciclo de vida de este hilo sería desde el inicio del método hasta el 
	// final del mismo
	@Override
	public void run() { //es como el hilo main pero para este hilo, este hilo 
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());//cuando lo arrance nacerá aqui
		for (int i = 0; i < 20; i++) {

			try {
				Thread.sleep(500);//simulación de tarea que tarda 500 milisegungdos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 0.5 segundos

			System.out
					.println("Hilo: " + Thread.currentThread().getName() 
							+ " , dice: " + valorImprimir + " ciclo: " + i);
		}
		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado");
	}// El hilo muere en esta línea
}

//el metodo run no tiene parametro de entrada ni salida, si le quiero pasar parametros, como lo hago?
//si no puedes modificar la firma del metodo porq para sobreescribir tiene que 
//la unica manera es : 
//mediante constructor
//mediante set