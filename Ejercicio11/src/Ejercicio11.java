import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String entrada;
		int f=0;
		do
		{
			System.out.println("Introduce una entrada de 20 caracteres como maximo: ");
			entrada= teclado.nextLine();
		}
		while(entrada.length()>20);
		for (int i=entrada.length();i>0;i--)
		{
			System.out.print(entrada.substring(entrada.length()-f,entrada.length()));
			++f;
			System.out.print(entrada.substring(0,i)+"\n");
		}
	}

}
