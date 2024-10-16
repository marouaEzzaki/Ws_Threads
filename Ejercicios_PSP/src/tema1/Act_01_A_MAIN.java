package tema1;

public class Act_01_A_MAIN {

	public static void main(String[] args) {

		Act_01_A hilo1 = new Act_01_A(903020309); // si es primo

		hilo1.setName("Hilo 1 ");

		Act_01_A hilo2 = new Act_01_A(379030203); // no es primo

		hilo2.setName("Hilo 2 ");

		Act_01_A hilo3 = new Act_01_A(998773219); // no es primo

		hilo3.setName("Hilo 3 ");
		
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		
		System.out.println("***EL MAIN SE PARA AQUÍ****");
		
		
	}

}
