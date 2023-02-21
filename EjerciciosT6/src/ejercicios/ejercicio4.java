package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Introduzca una frase para invertirla");
		frase = sc.nextLine();
		System.out.println(invertir(frase));
		
	}
	
	public static String invertir(String frase) {
		String fraseinv ="";
		
		for(int i=frase.length()-1;i>=0;i--) {
			fraseinv= fraseinv+frase.charAt(i);
		}
		
		return fraseinv;
	}

}
