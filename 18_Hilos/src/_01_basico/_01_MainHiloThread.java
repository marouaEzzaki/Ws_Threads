
package _01_basico;

public class _01_MainHiloThread {

	public static void main(String[] args) {
		
		//Este objeto será capaz de arrancar un hilo
		_01_HiloThread hilo1 = new _01_HiloThread("Valor 1");//por constructor le paso el valor a imprimir
															//para luego poder usarlo en el méodo run.
		hilo1.setName("Hilo1");//establecemos el nombre del hilo
		
		_01_HiloThread hilo2 = new _01_HiloThread("Valor 2");
		hilo2.setName("Hilo2");
		
		try {//el metodo sleep arroja excepciones de tipo checjed 
			//Duerme el hilo que pase por aquí durante un tiempo
			//En este caso, siempre será el main
			System.out.println("Esperando 5 segundos a arrancar los hilos... :), que nervios...");
			Thread.sleep(5000);//5 seg
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//arrancamos los dos hilos
		//ojo no se ejecuta run()
		hilo1.start();//aqui si pones run(), estarias haciendo una ejecución sequencia de toda la vida		
		hilo2.start();
		
		System.out.println("Hilo principal parando"); //el hilo main ejecuta solo la linea de aquí
		//el main eceuta solo esta linea y se va, pero no pasa nada porque el programa no se ha parado
		//porq 
		
		//El hilo principal acaba aquí, pero mientras haya un hilo en ejecución,
		//el programa seguirá con vida. Cuando mueran todos los hilos que a
		//arrancado un programa, será entonces cuando el programa finalice
	}

}
