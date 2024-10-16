package tema1;

public class Act_01_C {
	
	
	public static void main(String[] args) {
		
		
		Act_01_A hilo1 = new Act_01_A(903020309); // si es primo

		hilo1.setName("Hilo 1 ");

		Act_01_A hilo2 = new Act_01_A(379030203); // no es primo

		hilo2.setName("Hilo 2 ");

		Act_01_A hilo3 = new Act_01_A(998773219); // no es primo

		hilo3.setName("Hilo 3 ");
		
		//si ponemos run, se ejecuta de manera secuencial 
		hilo1.run();
		hilo2.run();
		hilo3.run();
		
		
		System.out.println("***EL MAIN SE PARA AQUÍ****");
		
		
		
	}

}
