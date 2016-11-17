import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String frase,palabra;
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		System.out.println("Escriba una palabra: ");
		palabra = teclado.next();
		if (frase.indexOf(palabra)==-1)
			System.out.println("0");
		else
		System.out.println("La palabra empieza en la posición: "+frase.indexOf(palabra));
	}

}
