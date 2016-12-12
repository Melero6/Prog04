//Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada carácter se transforme en 3 códigos ASCII mas es decir :
//Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
//Desarrollar los programas de codificar y descodificar mediante dos funciones.

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String entrada;
		int numCifrado, ascii, seleccion;
		
		System.out.println("Escribe una frase para cifrarla:");
		entrada = teclado.nextLine();
		entrada = entrada.toUpperCase();
		
		do{
			System.out.println("Escribe un numero del 1 al 10 para cifrar la frase:");
			numCifrado = teclado.nextInt();
		} while(numCifrado<=0||numCifrado>10);
		
		do{
			System.out.println("Escribe el numero de la opcion que desee ejecutar:\n1.Cifrar\n2.Descifrar");
			seleccion = teclado.nextInt();
			if(seleccion!=1&&seleccion!=2)
				System.out.println("ERROR! - Escribe 1 o 2 para seleccionar la opcion.");
		} while(seleccion!=1&&seleccion!=2);
		
		switch(seleccion){
		case(1):
			System.out.print("Frase cifrada: ");
			for (int i=0;i<entrada.length();i++)
			{
				ascii=entrada.codePointAt(i);
				ascii+=numCifrado;
				System.out.print((char)ascii);
			}
			break;
			
		case(2):
			System.out.print("La frase descifrada: ");
			for (int i=0;i<entrada.length();i++)
			{
				ascii=entrada.codePointAt(i);
				ascii-=numCifrado;
				System.out.print((char)ascii);
			}
			break;
		}
		
	}

}
