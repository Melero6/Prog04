//Hacer un programa para que pida una palabra de no m�s de 20 caracteres y efect�e todas las rotaciones posibles de dicha palabra de forma que el �ltimo car�cter pase al primero y los dem�s corran un espacio, es decir si la palabra fuera �HOLA� el resultado debe ser :
//HOLA
//AHOL
//LAHO
//OLAH
//Observar que una palabra de n caracteres tiene n rotaciones.

import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String entrada;
		int j=0;
		
		do
		{
			System.out.println("Introduce una entrada de 20 caracteres como maximo: ");
			entrada= teclado.nextLine();
		}while(entrada.length()>20);
		
		for (int i=entrada.length();i>0;i--)
		{
			System.out.print(entrada.substring(entrada.length()-j,entrada.length()));
			++j;
			System.out.print(entrada.substring(0,i)+"\n");
		}
	}

}
