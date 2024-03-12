package Controlador;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.*;

public class BDInfo {

	public static  ArrayList <Persona> ListaPersonas = new ArrayList <Persona> ();
	
public static void insertar()
{
	Scanner leer = new Scanner(System.in);
	Persona objper = new Persona();
	
	
	System.out.print("Ingrese identificacion: ");
	objper.setIdentificacion(leer.nextLine());
	
	System.out.print("Ingrese nombre: ");
	objper.setNombre(leer.nextLine());
	
	System.out.print("Ingrese direcci—n: ");
	objper.setDireccion(leer.nextLine());
	
	System.out.print("Ingrese telŽfono: ");
	objper.setTelefono(leer.nextLine());
	
	System.out.print("Ingrese email: ");
	objper.setEmail(leer.nextLine());
	
	
	ListaPersonas.add(objper);
	
	}


public static void modificarNombre(String identificacion, String nuevoNombre)
{
	
	//metodo que recorre arrayList
	for ( Persona i : ListaPersonas ) {
	
		if (i.getIdentificacion().equals(identificacion))
		{	
			System.out.println("Nombre anterior: "+i.getNombre());
			i.setNombre(nuevoNombre);
			
			System.out.println("Nombre modificdo: "+i.getNombre());
		}
	}
	
}

	public static void eliminar(String identificacion) {
	  int c=-1;
	    for (int i = 0; i < ListaPersonas.size();i++) {
	        if (ListaPersonas.get(i).getIdentificacion().equals(identificacion)) {
	             c=i;
	        }
	        
	    }
	    
	    if (c>-1) { 
	        ListaPersonas.remove(c); 
	        System.out.println("La persona con identificación " + identificacion + " ha sido eliminada correctamente.");
	        
	    } else {
	        System.out.println("No se encontró dicho registro");
	    }
	}
	
	


public static Persona buscarPorIdentificacion(String identificacion) {
    for (Persona persona : ListaPersonas) {
        if (persona.getIdentificacion().equals(identificacion)) {
        	System.out.println("Identificacion\t Nombre \t2 Direccion \t Telefono \t Email");
        	System.out.println("----------------------------------------------------------------------");
            System.out.println(persona);
              return persona;
        }
    }
    return null;
}


public static void listar()
{
	/*System.out.println("Identificacion\t Nombre \t2 Direccion \t Telefono \t Email");
	System.out.println("----------------------------------------------------------------------");

   for ( Persona i : ListaPersonas ) 
   {
         System.out.println(ListaPersonas);
         
   }*/
	System.out.println("Identificacion\t Nombre \t2 Direccion \t Telefono \t Email");
	System.out.println("----------------------------------------------------------------------");
	for(int i=0; i < ListaPersonas.size(); i++)
	{
		System.out.println(ListaPersonas.get(i));	
		
	}

	

}
}

