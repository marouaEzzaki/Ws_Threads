package tema1;

import java.util.Scanner;

public class Act_01_B_MAIN {

	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		long num1, num2;
		String cadena;
		
		System.out.print("Introduce el primer número -> ");
		num1  = scNum.nextLong();
		
		System.out.print("Introduce el segundo número -> ");
		num2  = scNum.nextLong();
		
		System.out.print("Introduce una cadena -> ");
		cadena  = scString.nextLine();
		
		
		//Tarea  1
		Act_01_B_TAREA1 hilo1 = new Act_01_B_TAREA1(num1);
		
		Thread hilo1_B = new Thread(hilo1);
		hilo1_B.setName("Hilo 1");
		
		hilo1_B.start();
		
		
		//Tarea 2
		
		Act_01_B_TAREA2 hilo2 = new Act_01_B_TAREA2(num2);
		
		
		hilo2.setName("Hilo 2");
		hilo2.start();
		
		//Tarea 3 
		
		long numReps = num2 - num1;
		
		Act_01_B_TAREA3 hilo3 = new Act_01_B_TAREA3(cadena, numReps);
		
		Thread t3 = new Thread(hilo3);
		
		t3.setName("Hilo 3 ");
		
		t3.start();
		
		
		
		
	}
}
