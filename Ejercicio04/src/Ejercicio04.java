import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		String frase, mayusculasoMinusculas;

		do{
			System.out.println("Escribe una frase de menos de 80 caracteres: ");
			frase=teclado.nextLine();
		}
		while(frase.length()>80);

		System.out.println("Escribe la opcion que deseas sin acento \n- Mayusculas\n- Minusculas");
		mayusculasoMinusculas=teclado.next();

		if(mayusculasoMinusculas.equalsIgnoreCase("Mayusculas"))
			System.out.println(frase.toUpperCase());

		else if(mayusculasoMinusculas.equalsIgnoreCase("Minusculas"))
			System.out.println(frase.toLowerCase());

		else
			System.out.println("ERROR: Escribe mayusculas o minusculas.");

	}

}
