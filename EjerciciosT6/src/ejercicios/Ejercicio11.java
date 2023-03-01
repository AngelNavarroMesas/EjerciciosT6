package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, palabramax = "";
		
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		
		String[] separacion = frase.split(" ");
		
		for(int i=0;i<separacion.length;i++) {
			if(separacion[i].length()>palabramax.length()) {
				palabramax=separacion[i];
			}
			
		}
		
		System.out.println("La palabra mas grande de la frase es '"+palabramax+"' con "+palabramax.length()+" letras");
		
	}

}
