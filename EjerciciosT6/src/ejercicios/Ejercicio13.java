package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int cont=0;
		
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		
		for(int i=0;i<abc.length-1;i++) {
			for(int x=0;i<frase.length();x++) {
				if(abc[i]==frase.charAt(x)) {
					cont++;
				}
			}
			System.out.println(abc[i]+": "+cont+" veces");
			
		}
	}

}
