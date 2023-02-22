package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, inicio="Javalin, javalon		", fin="		javalen, len, len";
		
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		
		if(frase.contains(inicio)) {
			System.out.println("La frase esta escrita en idioma de Javalandia");
			System.out.println(frase.replace(inicio, ""));
		}else if(frase.contains(fin)) {
			System.out.println("La frase esta escrita en idioma de Javalandia");
			System.out.println(frase.replace(fin, ""));
		}else {
			System.out.println("La frase no esta escrita en idioma de Javalandia");
		}
		
	}

}
