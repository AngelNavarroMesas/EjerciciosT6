package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] conju1 = {'e', 'i','k','m','p','q','r','s','t','u','v'};
		char[] conju2 = {'p', 'v','i','u','m','t','e','r','k','q','s'};
		char[] c;
		String palabra;
		
		System.out.println("Introduzca una palabra para codificarla");
		palabra = sc.nextLine();
		c = palabra.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			c[i]=codificado(conju1, conju2,c[i]);
		}
		
		System.out.println(palabra = String.valueOf(c));
		
	}
	
	
	public static char codificado(char[] conju1, char[] conju2, char c) {
		int x=0;
		
		do {
			if(conju1[x]==c){
				c =conju2[x];
				break;
			}else if(x==10){
				break;
			}else {
				x++;
			}
			
		}while(true);
		
		return c;
	}
}
