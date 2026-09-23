package exeptions;

import java.util.Scanner;

public class ExcepcionAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean revicion=false;
		int suma=0;
		int cal=0;
		double promedio=0.0;
		
		while(!revicion) {
			System.out.println("Cuantas calificaciones registrara? ");
			int calificacion=sc.nextInt();
			for(int i=0;i<calificacion;i++) {
				System.out.println("ingresa calificacion "+i);
				cal=sc.nextInt();
				suma+=cal;
			}
			try {
				promedio=suma/calificacion;
				System.out.println("El promedio es: "+promedio);
				revicion=true;
				
			}catch(ArithmeticException e) {
				System.out.println("Error al calcular el promedio...intentalo de nuevo...\n");
			}
			
		}
		System.out.println("El programa continua...");
		sc.close();
	}

}
