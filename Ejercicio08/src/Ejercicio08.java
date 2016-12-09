//Leer una frase filtr�ndola a que todos sus caracteres sean may�sculas, una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada car�cter se transforme en 3 c�digos ASCII mas es decir :
//Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
//Desarrollar los programas de codificar y descodificar mediante dos funciones.

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String entrada;
		int numCifrado,numCifradoMemoria, i, ascii;
		
		System.out.println("Escribe una frase para cifrarla: ");
		entrada = teclado.nextLine();
		entrada= entrada.toUpperCase();
		
		System.out.println("Escribe un numero del 1 al 10 para cifrar la frase: ");
		numCifrado = teclado.nextInt();
		
		numCifradoMemoria=numCifrado;
		
		while(numCifrado<=0||numCifrado>10)
			{
			System.out.println("ERROR: ");
			System.out.println("Escribe un numero del 1 al 10 para cifrar la frase");
			numCifrado = teclado.nextInt();
			}
		
		System.out.print("Frase cifrada: ");
		for (i=0;i<entrada.length();i++)
		{
			ascii=entrada.codePointAt(i);
			ascii=ascii+numCifrado;
			
			System.out.print((char)ascii);
		}
		
		System.out.println("\n\nEscribe el numero para decodificar la frase: ");
		numCifrado = teclado.nextInt();
		
		System.out.print("La frase descifrada: ");
		for (i=0;i<entrada.length();i++)
		{
			ascii=entrada.codePointAt(i)+numCifradoMemoria;
			ascii=ascii-numCifrado;
			System.out.print((char)ascii);
		}
		
	}

}
