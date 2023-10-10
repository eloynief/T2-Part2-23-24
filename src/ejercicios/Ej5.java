package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variable que representa lo que escribamos para saber de que es el cartnet
		String carnet;
		
		//muestra en pantalla que escribamos una opcion
		System.out.println("Escribe una opcion: E,D,C1,C2,C3,C4,C5,A,B1,B2 ");
		
		//escribimos la 
		carnet=sc.nextLine();
		
		
		switch(carnet) {
		case "E":{
			System.out.println("Es un remolque");
		}
		case "D":{
			System.out.println("Es un bus");
		}
		case "C1","C2","C3","C4","C5":{
			System.out.println("Es un macion");
		}
		case "A":{
			System.out.println("Es una moto brubibiububibhb");
		}
		case "B1","B2":{
			System.out.println("Es un automovil");
		}
		default:{
			System.out.println("Categoria no contemplada");
		}
		}
		//cierre de scanner
		sc.close();
		
		
	}

}
