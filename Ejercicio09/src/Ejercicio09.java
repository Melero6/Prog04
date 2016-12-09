//Escribir un programa que lea c�digos de personas de 8 caracteres de modo que los cuatro primeros sean num�ricos y contenidos entre 1990-1995 (un a�o), el quinto car�cter sea solo (H � M) sexo, el sexto un numero que representa el curso 1 � 2 y los caracteres s�ptimo y octavo pueden tener cualquier valor.
//Deben rechazarse los c�digos que no cumplan estas condiciones, la finalizaci�n de entrada de c�digos se produce cuando se introduce el c�digo �00000000�. 
//Al final el programa debe sacar un informe indicando cu�ntos hombres y mujeres hay matriculados en primero y segundo y cu�ntos c�digos correctos han sido le�dos.

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
