import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int errores=0;
		String entrada;
		System.out.println("Introduce el codigo");
		entrada = teclado.nextLine();
	
		
		if (entrada.length()>8)
			++errores;

		else if (entrada.substring(0,2)!="199")
		{
			++errores;
		}
		else if (entrada.charAt(3)!='0'&&entrada.charAt(3)!='1'&&entrada.charAt(3)!='2'&&entrada.charAt(3)!='4'&&entrada.charAt(3)!='5')
		{
			++errores;
		}
		else if (entrada.charAt(4)!='H'&&entrada.charAt(4)!='M')
		{
			++errores;
		}
		else if (entrada.charAt(5)!='1'&&entrada.charAt(5)!='2')
		{
			++errores;
		}
	}

}
