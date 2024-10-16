package _03_sincronizado_01;

//en este ejemplo se simula que vamos a tener avengers sueltos por ahi,
//los avengers van a ser hilos para que se puedan movel libremente por 
//Nueva York

//si dos personajes disparan a una misma persona, solamente puede matarlo uno de los 
//eso es un problema de concurrencia
//si ambos ejecutan el método atacar habría un problema de concurrencia.

//para evitar este problema usamos la sincronización entre hilos, cuando
//sincronizamos un hilo , en cuanto entre el primer hilo no puede entrar
//ningun hilo mas hasta que el hilo que entró salga del método o bloque.

//la sincronizacion del metodo es a nivel de objeto
public class Avenger implements Runnable {
	private String nombre;
	private String saludo,frase;
	private Fiesta fiesta; //
	
	public Avenger(String nombre,String saludo,String frase, Fiesta fiesta) {
		this.nombre = nombre;
		this.saludo = saludo;
		this.frase = frase;
		this.fiesta = fiesta;
	}
	
	//Cuando invocamos el método start(), se arranca el hilo y se ejecuta
	//el método run()
	@Override
	public void run() {
		fiesta.entrar(nombre,saludo,frase);
	}

}
