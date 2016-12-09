//Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas y minúsculas tiene y lo imprima.

import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int mayusculas=0, minusculas=0;
		String entrada;

		do
		{
			System.out.print("Introduce una frase de menos de 80 caracteres : ");
			entrada =teclado.nextLine();
		}
		while(entrada.length()>80);
		for(int i=0;i<entrada.length();i++)
		{
			if (entrada.charAt(i)>='a'&&entrada.charAt(i)<='z')
				++minusculas;
			else if (entrada.charAt(i)>='A'&&entrada.charAt(i)<='Z')
				++mayusculas;
		}
		System.out.print("Hay "+minusculas+" minusculas y "+mayusculas+" mayusculas.");

	}

}
