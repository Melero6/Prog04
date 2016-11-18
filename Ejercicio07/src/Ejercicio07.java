		
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i , mayusculas=0, minusculas=0, numeros=0;
		String frase;
		System.out.println("Introduce una frase:");
		frase= teclado.nextLine();

		for(i=0;i<frase.length();i++)
		{
			if (frase.charAt(i)>='A'&&frase.charAt(i)<='Z'||frase.charAt(i)=='Ñ')
				++mayusculas;

			else if (frase.charAt(i)>='a'&&frase.charAt(i)<='z'||frase.charAt(i)=='ñ')
				++minusculas;

			else if (frase.charAt(i)>='0'&&frase.charAt(i)<='9')
				++numeros;
		}
		
		System.out.println("Hay: \n- Numero de mayusculas: "+mayusculas+"\n- Numero de minusculas: "+minusculas+"\n- Cantidad de numeros: "+numeros);

	}
}			
