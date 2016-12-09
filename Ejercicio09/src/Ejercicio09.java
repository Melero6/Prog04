//Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo (H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y octavo pueden tener cualquier valor.
//Deben rechazarse los códigos que no cumplan estas condiciones, la finalización de entrada de códigos se produce cuando se introduce el código “00000000”. 
//Al final el programa debe sacar un informe indicando cuántos hombres y mujeres hay matriculados en primero y segundo y cuántos códigos correctos han sido leídos.

import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int errores=0, hombresPrimero=0, mujeresPrimero=0, hombresSegundo=0, mujeresSegundo=0;
		String entrada;

		System.out.println("Introduce el codigo");
		entrada = teclado.next();
		//199XXX00
		//01234567
		while (!entrada.equals("00000000"))
		{
			if (entrada.length()!=8)
				++errores;
			
			else if (entrada.substring(0,3).equals("199"))
			{
						
				if (entrada.charAt(3)<'0'||entrada.charAt(3)>'5')
					++errores;
				
				else if (entrada.substring(4,6).equalsIgnoreCase("H1"))
					++hombresPrimero;
						
				else if (entrada.substring(4,6).equalsIgnoreCase("H2"))
					++hombresSegundo;
						
				else if (entrada.substring(4,6).equalsIgnoreCase("M1"))
					++mujeresPrimero;
				
				else if (entrada.substring(4,6).equalsIgnoreCase("M2"))
					++mujeresSegundo;
			
				else
					++errores;
			}
			else
				++errores;

			System.out.println("Introduce el codigo");
			entrada = teclado.next();

		}

		System.out.println("Hay "+hombresPrimero+" hombres en primero y "+ hombresSegundo+" en segundo.");
		System.out.println("Hay "+mujeresPrimero+" mujeres en primero y "+ mujeresSegundo+" en segundo.");
		System.out.println("Se han cometido "+errores+" errores.");
	}

}
