package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variable que representan las tiradas de los dados
		String tirada1,tirada2;
		
		//
		int num,num2;
		
		//nos pide que escribamos cuanto saco en la primera tirada
		System.out.println("Escribe cuanto ha sacado en la primera tirada de los dados: ");
		
		//escribimos el valor de la primera tirada
		tirada1=sc.nextLine();
		
		
		//switch que hara lo que este en los casos dependiendo del valor de la tirada
		num= switch (tirada1) {
		//dependiendo de lo que escribas esto da un valor a la variable o otro
		case "UNO" -> 1;
		case "DOS" -> 2;
		case "TRES" -> 3;
		case "CUATRO" -> 4;
		case "CINCO" -> 5;
		case "SEIS" -> 6;
		default -> 0;
		};
		
		//nos pide que escribamos cuanto ha sacado en la segunda tirada
		System.out.println("Escribe cuanto ha sacado en la segunda tirada: ");
		
		//tambien escribimos el valor de la segunda tirada
		tirada2=sc.nextLine();

		
		//switch que hara lo que este en los casos dependiendo del valor de la tirada
		num2= switch (tirada2) {
		//dependiendo de lo que escribas esto da un valor a la variable o otro
		case "UNO" -> 1;
		case "DOS" -> 2;
		case "TRES" -> 3;
		case "CUATRO" -> 4;
		case "CINCO" -> 5;
		case "SEIS" -> 6;
		default -> 0;
		};
		

		//cierre de scanner
		sc.close();
		
		
	}

}
