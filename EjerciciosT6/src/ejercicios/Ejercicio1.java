package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase1, frase2;
		
		System.out.println("Introduzca una frase");
		frase1 = sc.nextLine();
		System.out.println("Introduzca otra frase");
		frase2 = sc.nextLine();
		
		if(frase1.length()>frase2.length()) {
			System.out.println("La primera frase es mas larga que la segunda");
		}else if(frase1.length()<frase2.length()) {
			System.out.println("La segunda frase es mas larga que la segunda");
		}else if(frase1.length()==frase2.length()) {
			System.out.println("Las dos frases tienen el mismo tamaño");
		}
	}

}
