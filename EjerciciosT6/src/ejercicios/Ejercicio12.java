package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		int cont=0;
		
		System.out.println("Introduzca una palabra");
		palabra1 = sc.next();
		System.out.println("Introduzca otra palabra para ver si son anagramas");
		palabra2 = sc.next();
		
		
		if(palabra1.length()>palabra2.length()||palabra2.length()>palabra1.length()) {
			System.out.println("Las palabras introducidas no son anagramas");
		}else {
			
			for(int i=0;i<palabra1.length();i++) {
				for(int x=0;x<palabra2.length();x++) {
					if(palabra1.charAt(i)==palabra2.charAt(x)) {
						cont++;
						break;
					}
				}
			}
			
			if(cont==palabra1.length()) {
				System.out.println("Las palabras introducidas son anagramas la una de la otra");
			}else {
				System.out.println("Las palabras introducidas no son anagramas la una de la otra");
			}
			
		}
		
	}

}
