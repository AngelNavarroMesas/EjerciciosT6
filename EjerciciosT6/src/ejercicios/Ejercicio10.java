package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] conju1 = {'e', 'i','k','m','p','q','r','s','t','u','v'};
		char[] conju2 = {'p', 'v','i','u','m','t','e','r','k','q','s'};
		char[] c;
		String palabra;
		
		System.out.println("Introduzca una palabra para descodificarla");
		palabra = sc.nextLine();
		c = palabra.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			c[i]=descodificado(conju1, conju2,c[i]);
		}
		
		System.out.println(palabra = String.valueOf(c));
		
	}
	
	public static char descodificado(char[] conju1, char[] conju2, char c) {
		int x=0;
		
		do {
			if(conju2[x]==c){
				c =conju1[x];
				break;
			}else if(x==conju1.length-1){
				break;
			}else {
				x++;
			}
			
		}while(true);
		
		return c;
	}

}
