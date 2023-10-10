package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		//pedimos que pongamos un numero
		System.out.println("Introduzca el primer numero: ");
		
		//el valor de ese numero se guarda en la variable correspondiente
		num=sc.nextInt();
		
		switch (num) {
		//resumir el insuficiente enc un solo caso  maybe
		
		case 0,1,2,3,4->{
			System.out.println("Insuficiente");
		}
		case 5->{
			System.out.println("Suficiente");
		}
		case 6->{
			System.out.println("Bien");
		}
		case 7,8->{
			System.out.println("Notable");
		}
		case 9,10->{
			System.out.println("Sobresaliente");
		}
		default->{
			System.out.println("Valor erroneo");
			System.err.println("Apagando...");
		}
		
		}
		
		
		//cierre de scanner
		sc.close();
		
		
	}

}
