import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String entrada;
		int letrasDistintas=0, cantidadLetras=0;

		do
		{
			System.out.println("Introduce una entrada de 60 caracteres como maximo: ");
			entrada= teclado.nextLine();
		}
		while(entrada.length()>60);
		entrada=entrada.toUpperCase();
		System.out.print("Hay: ");
		for (int f=65;f<=90;f++)
		{
			for (int i=0; i<entrada.length();i++)
			{
				if (entrada.charAt(i)==f)
					++cantidadLetras;
			}

			if (cantidadLetras!=0)
			{
				++letrasDistintas;
				System.out.print(cantidadLetras);
				System.out.print("'"+(char)f+"'");
				System.out.print(" ");
			}
			cantidadLetras=0;
		}
		System.out.println("\nHay: "+letrasDistintas+" letras diferentes.");

	}

}
