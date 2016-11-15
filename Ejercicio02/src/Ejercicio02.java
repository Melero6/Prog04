import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduce la frase : ");
		int mayusculas=0, minusculas=0,i;
		String entrada;
		entrada =teclado.nextLine();
		while(entrada.length()>80)
		{
			System.out.print("Supera los 80 caracteres!");
			System.out.print("Introduce la frase : ");
			entrada =teclado.nextLine();
		}
		for(i=0;i<=entrada.length();i++)
		{
			if (entrada.charAt(i)>'a'&&entrada.charAt(i)<'z')
			{
				++minusculas;
			}
			else
				++mayusculas;
		}
		System.out.print("Hay "+minusculas+" minusculas y "+mayusculas+" mayusculas.");
		
	}

}
