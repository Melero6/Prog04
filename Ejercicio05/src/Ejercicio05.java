//Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma que una contenga los caracteres en posición par y la otra los caracteres en posición impar.

import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i;
		String frase;
		
		do{
			System.out.println("Escribe una frase de menos de 80 caracteres: ");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		
		System.out.print("Caracteres impares: ");
		for(i=0;i<frase.length();i+=2)
			System.out.print(frase.charAt(i));
		
		System.out.print("\nCaracteres pares: ");
		for(i=1;i<frase.length();i+=2)
			System.out.print(frase.charAt(i));
		
	}

}
