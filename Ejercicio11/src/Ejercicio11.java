import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String entrada;
		do
		{
			System.out.println("Introduce una entrada de 60 caracteres como maximo: ");
			entrada= teclado.nextLine();
		}
		while(entrada.length()>20);
		
		for (int i=0;i<entrada.length();i++)
		{
			//caracteres
			
		}
	}

}
