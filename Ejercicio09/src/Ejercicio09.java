import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		boolean correcto=false;
		int errores=0, hombresPrimero=0, mujeresPrimero=0, hombresSegundo=0, mujeresSegundo=0;
		String entrada;
		System.out.println("Introduce el codigo");
		entrada = teclado.next();

		while (correcto==false)
		{

			if (entrada.length()>8)
			{

				System.out.println("ERROR: Codigo incorrecto");
				++errores;
			}
			else if (entrada=="00000000")
				correcto=true;
			else if (entrada.substring(0,2)!="199")
			{
				System.out.println("ERROR: Codigo incorrecto");
				++errores;
			}
			else if (entrada.charAt(3)!='0'&&entrada.charAt(3)!='1'&&entrada.charAt(3)!='2'&&entrada.charAt(3)!='4'&&entrada.charAt(3)!='5')
			{
				System.out.println("ERROR: Codigo incorrecto");
				++errores;
			}
			else if (entrada.charAt(4)!='H'&&entrada.charAt(4)!='M')
			{
				System.out.println("ERROR: Codigo incorrecto");
				++errores;
			}
			else if (entrada.charAt(5)!='1'&&entrada.charAt(5)!='2')
			{
				System.out.println("ERROR: Codigo incorrecto");
				++errores;
			}
			else if (entrada.substring(4,5)=="H1")
			{
				++hombresPrimero;
			}		
			else if (entrada.substring(4,5)=="H2")
			{
				++hombresSegundo;
			}		
			else if (entrada.substring(4,5)=="M1")
			{
				++mujeresPrimero;
			}		
			else if (entrada.substring(4,5)=="M2")
			{
				++mujeresSegundo;
			}
			if(correcto==false)
			{
			System.out.println("Introduce el codigo");
			entrada = teclado.next();
			}
		}

		System.out.println("Hay "+hombresPrimero+" hombres en primero y "+ hombresSegundo+" en segundo.");
		System.out.println("Hay "+mujeresPrimero+" mujeres en primero y "+ mujeresSegundo+" en segundo.");
		System.out.println("Se han cometido "+errores+" errores.");
	}

}
