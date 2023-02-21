package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra, frase="";
		int fin=0;
		
		while(fin!=1) {
			System.out.println("Introduzca una palabra para añadir a la frase o ponga fin para terminarla");
			palabra = sc.next();
			
			if(palabra.equalsIgnoreCase("fin")) {
				fin=1;
			}else {
				frase = frase+" "+palabra;
			}
			
		}
		
		System.out.println(frase);
		
	}

}
