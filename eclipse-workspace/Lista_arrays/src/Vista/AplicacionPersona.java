package Vista;

import java.io.IOException;
import java.util.Scanner;

import Controlador.BDInfo;
import Modelo.Persona;


public class AplicacionPersona {

	public static void main (String args[]) throws IOException
	{
		String identificacion=null;
		Scanner modificador = new Scanner(System.in);
		BDInfo info = new BDInfo();
		int op=0;
		do{
		clearConsole();
		op = menu();
		switch(op){
		case 1:  info.insertar();break;
		
		case 2: System.out.print("Ingrese la identificación a buscar: ");
		identificacion = modificador.nextLine(); 
		info.buscarPorIdentificacion(identificacion);break;
		
		case 3:  System.out.println("Ingrese la identificion que desea modificar");
		identificacion = modificador.nextLine();
		System.out.println("Ingrese la el nuevo nombre que desea asignar: "); 
		String nuevoname = modificador.nextLine();
		info.modificarNombre(identificacion,nuevoname);break;
		
		
		case 4: System.out.println("Ingrese la identificion que desea eliminar");
		identificacion = modificador.nextLine();
			info.eliminar(identificacion);break;
		
		case 5:  info.listar();break;
		case 6:  System.exit(0); break;
		default : System.out.println("Opcion no valida");
		
		}
		}while(op != 6);
		
		
	}
	
	public static int menu()
	{
		 Scanner leer = new Scanner(System.in);
		 int opc;
		System.out.println("MENU\n");
		System.out.println("1. Adicionar");
		System.out.println("2. Buscar");
		System.out.println("3. Modificar");
		System.out.println("4. Eliminar");
		System.out.println("5. Listar");
		System.out.println("6. Salir");
		System.out.println("Ingrese la opcion deseada");
		opc=leer.nextInt();
		return opc;
	}
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
}

