package ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//
		int num1,num2,suma,resta,multiplicacion;
		double division;
		String opcion;
		
		//pedimos que pongamos un numero
		System.out.println("Introduzca el primer numero: ");
		
		//el valor de ese numero se guarda en la variable correspondiente
		num1=sc.nextInt();

		//pedimos que pongamos un numero
		System.out.println("Introduzca el segundo numero: ");
		
		//el valor de ese numero se guarda en la variable correspondiente
		num2=sc.nextInt();
		
		System.out.println("Introduzca la opcion: SUMAR,RESTAR,MULTIPLICAR o DIVIDIR");
		
		//para que lea lo que escribas incluyendo los espaciados
		opcion=sc.nextLine();
		
		switch(opcion) {
		case "SUMAR":{
			suma=num1+num2;
			break;
		}
		case "RESTAR":{
			resta=num1-num2;
			break;
		}
		case "MULTIPLICAR":{
			multiplicacion=num1*num2;
			break;
		}
		case "DIVIDIR":{
			division=num1/num2;
			break;
		}
		}

		//cierre de scanner
		sc.close();
		
		
	}

}
