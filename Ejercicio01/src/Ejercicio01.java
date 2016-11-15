import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String entrada;
		int i,a;
		System.out.print("Introduce la frase: ");
		entrada=teclado.nextLine();
		if(entrada.length()<=80)
		{
			for(i=0;i<entrada.length();i++)
			{
				for(a=0;a<=i;a++)
				{
					System.out.print(entrada.charAt(a));
				}
				System.out.println();
			}
		}
		else
			System.out.println("La frase supera los 80 caracteres.");

	}

}
