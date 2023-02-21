package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseña, intento, aciertos;
		char letra;
		int x=0;
		
		System.out.println("Jugandor1 introduzca la contraseña");
		contraseña = sc.next();
		
		
		
		while(x!=1) {
			System.out.println("Jugador2 intente adivinar la contraseña");
			intento = sc.next();
			
			if(intento.equals(contraseña)) {
				System.out.println("Enorabuena, has adivinado la contraseña!!");
				x=1;
			}else {
				for(int i=0;i<contraseña.length();i++) {
					if(intento.charAt(i)==contraseña.charAt(i)) {
						
					}
				}
			}
			
		}
		
		
	}

}
