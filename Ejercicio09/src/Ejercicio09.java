import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int errores=0, hombresPrimero=0, mujeresPrimero=0, hombresSegundo=0, mujeresSegundo=0;
		String entrada, entradaSub45, entradaSub02;
		System.out.println("Introduce el codigo");
		entrada = teclado.next();
		entradaSub45=entrada.substring(4,5);
		System.out.println("Introduce el codigo");
		entradaSub02=entrada.substring(0,2);

		while (!entrada.equals("00000000"))
		{

			if (entrada.length()!=8)
			{

				System.out.println("ERROR: Codigo incorrecto long");
				++errores;
			}
			else if (entradaSub02.equals("199"))
			{
						
				if (entrada.charAt(3)<'0'&&entrada.charAt(3)>'5')
				{
					System.out.println("ERROR: Codigo incorrecto 05");
					++errores;
				}
				else if (entradaSub45.equalsIgnoreCase("H1"))
					++hombresPrimero;
						
				else if (entradaSub45.equalsIgnoreCase("H2"))
					++hombresSegundo;
						
				else if (entradaSub45.equalsIgnoreCase("M1"))
					++mujeresPrimero;
				
				else if (entradaSub45.equalsIgnoreCase("M2"))
					++mujeresSegundo;
			
				else
				{
					System.out.println("ERROR: Codigo incorrecto hm12");
					++errores;
				}
			}
//			else
//			{
//				System.out.println("ERROR: Codigo incorrecto");
//				++errores;
//			}

			System.out.println("Introduce el codigo");
			entrada = teclado.next();
			entradaSub45=entrada.substring(4,5);
			entradaSub02=entrada.substring(0,2);
		}

		System.out.println("Hay "+hombresPrimero+" hombres en primero y "+ hombresSegundo+" en segundo.");
		System.out.println("Hay "+mujeresPrimero+" mujeres en primero y "+ mujeresSegundo+" en segundo.");
		System.out.println("Se han cometido "+errores+" errores.");
	}

}
