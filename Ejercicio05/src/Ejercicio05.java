
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i;
		String frase;
		System.out.println("Introduce una frase de 80 caracteres como maximo");
		frase= teclado.nextLine();
		while(frase.length()>80)
		{
			System.out.println("ERROR: ");
			System.out.println("Introduce una frase de 80 caracteres como maximo");
			frase= teclado.nextLine();
		}
		System.out.print("Caracteres impares: ");
		for(i=0;i<frase.length();i+=2)
		{
			System.out.print(frase.charAt(i));

		}
		System.out.println();
		System.out.print("Caracteres pares: ");
		for(i=1;i<frase.length();i+=2)
		{
			System.out.print(frase.charAt(i));
		}

	}

}
