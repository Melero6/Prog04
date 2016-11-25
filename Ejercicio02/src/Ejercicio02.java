import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int mayusculas=0, minusculas=0,i;
		String entrada;

		do
		{
			System.out.print("Introduce una frase de menos de 80 caracteres : ");
			entrada =teclado.nextLine();
		}
		while(entrada.length()>80);
		for(i=0;i<entrada.length();i++)
		{
			if (entrada.charAt(i)>='a'&&entrada.charAt(i)<='z')
				++minusculas;
			else if (entrada.charAt(i)>='A'&&entrada.charAt(i)<='Z')
				++mayusculas;
		}
		System.out.print("Hay "+minusculas+" minusculas y "+mayusculas+" mayusculas.");

	}

}
