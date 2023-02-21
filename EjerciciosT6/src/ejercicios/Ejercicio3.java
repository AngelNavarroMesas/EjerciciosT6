package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		int con=0;
		
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		
		for(int i=0; i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				con++;
			}
		}
		
		System.out.println(con);
	}

}
