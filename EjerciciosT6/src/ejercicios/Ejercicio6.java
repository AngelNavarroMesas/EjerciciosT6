package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, palabra;
		int rec=0, cont=0, recont=0;
		
		System.out.println("Escriba una frase");
		frase = sc.nextLine();
		System.out.println("Introduzca una palabra para buscarla en la frase");
		palabra = sc.nextLine(); 
		
		for(int i=0; i<frase.length();i++) {
			rec = frase.indexOf(palabra, recont);
			
			if(rec>=0) {
				recont=rec+1;
				cont++;
			}
		}
		
		System.out.println("La palabra introducida aparece "+cont+" veces en la frase");
		
	}

}
