package exeptions;

import java.util.Scanner;

public class ArregloFueraDeLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean revicion=false;
		int caltamaño;
		
		System.out.println("cuantas calificaciones registrara? ");
		caltamaño=sc.nextInt();
		int[] calificaciones= new int[caltamaño];
		
		for(int i=0;i<caltamaño;i++) {
			System.out.println("Ïngrese calificación "+i);
			calificaciones[i]=sc.nextInt();
		}
		
		while(!revicion) {	
			
			try {	System.out.println("Que calificacion quieres ver? \n");
				int posicion=sc.nextInt();
				System.out.println(calificaciones[posicion]);
				revicion=true;
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posición invalida, intentalo de nuevo...");
			}
			
		}
		System.out.println("El programa continua...");
		
		sc.close();

	}

}
