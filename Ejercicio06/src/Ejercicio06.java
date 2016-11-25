			
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i , vocales=0, consonantes=0, numeros=0;
		String frase;
		do{
			System.out.println("Escribe una frase de menos de 80 caracteres: ");
			frase=teclado.nextLine();
		} while(frase.length()>80);
		
		frase = frase.toLowerCase();
		for(i=0;i<frase.length();i++)
		{
			if (frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u')
				++vocales;

			else if (frase.charAt(i)>='a'&&frase.charAt(i)<='z'||frase.charAt(i)=='ñ')
				++consonantes;

			else if (frase.charAt(i)>='0'&&frase.charAt(i)<='9')
				++numeros;
		}
		
		System.out.println("Hay: \n- Numero de vocales: "+vocales+"\n- Numero de consonantes: "+consonantes+"\n- Cantidad de numeros: "+numeros);

	}
}			
