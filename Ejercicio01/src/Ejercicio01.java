//Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es: “ciervo”, el programa debe imprimir
//c
//ci
//cie
//cier
//cierv
//ciervo


import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String entrada;

		System.out.print("Introduce la frase: ");
		entrada=teclado.nextLine();
		if(entrada.length()<=80)
		{
			for(int i=0;i<entrada.length();i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print(entrada.charAt(j));
				}
				System.out.println();
			}
		}
		else
			System.out.println("La frase supera los 80 caracteres.");

	}

}
