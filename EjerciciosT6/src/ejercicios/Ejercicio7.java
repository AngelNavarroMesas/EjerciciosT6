package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, fraseaux="";
		char letra;
		
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		
		for(int i=frase.length()-1;i>=0;i--) {
			fraseaux= fraseaux+frase.charAt(i);
		}
		
		if(fraseaux.equals(frase)) {
			System.out.println("La frase introducida es palindroma");
		}else {
			System.out.println("La frase introducida no es palindorma");
		}
		
	}

}
