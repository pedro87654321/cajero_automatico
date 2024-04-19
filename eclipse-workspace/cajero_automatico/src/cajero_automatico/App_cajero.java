package cajero_automatico;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
public class App_cajero {

	public static void main(String[] args) {
		
		int numero;
		Scanner ops = new Scanner(System.in);
		do {
			
		
		Scanner leer = new Scanner(System.in);
		Cajero cajero = new Cajero("servibanco",1023985);
		Cliente cliente = new Cliente(null, 0, null, null, 0, null);
		Tarjeta tarjeta = new Tarjeta(null, 0, null, null, 0, null, 0, null, 0);
		Banco banco = new Banco(null, 0, null, null, 0, null, 0, null, 0, null, 0, 0);
		Transaccion transaccion = new Transaccion(null, 0, null, null, 0, null, 0, null, 0, null, 0, 0, 0, 0, 0, null); 
		
		System.out.print(cajero.getNombre_cajero()+" #: ");
		System.out.println(cajero.getNumero_cajero());
	    System.out.println("ingre usuario:");
        cliente.setUsuario(leer.nextLine());
        System.out.println("ingrese clave:");
        cliente.setClave(leer.nextLine());
        System.out.println("seleccione tipo de persona");
        System.out.println("oprima (1)persona natural  (2)persona juridica");
        cliente.setTipo_persona(leer.nextInt());
     
        while(cliente.getTipo_persona()<1||cliente.getTipo_persona()>2)
        {
        	System.out.println("valor incorrecto");
        	 System.out.println("seleccione tipo de persona");
            System.out.println("oprima (1)persona natural  (2)persona juridica");
            cliente.setTipo_persona(leer.nextInt());
        }
        String persona = null;
        switch(cliente.getTipo_persona())
        {
   	      case 1 : persona="persona natural";break;
	      case 2 : persona="persona juridica";break;
        }
        cliente.setTipo_persona_2(persona);
	    System.out.println("seleccione tipo de tarjeta");
        System.out.println("oprima (1)devito  (2)credito");
        tarjeta.setTipo_trajeta(leer.nextInt());
        
        while(tarjeta.getTipo_trajeta()<1||tarjeta.getTipo_trajeta()>2)
        {
        	System.out.println("valor incorrecto");
        	System.out.println("seleccione tipo de tarjeta");
            System.out.println("oprima (1)devito  (2)credito");
            tarjeta.setTipo_trajeta(leer.nextInt());
        }
        String tarjetas = null;
        switch(tarjeta.getTipo_trajeta())
        {
          case 1 : tarjetas="devito";break;
	      case 2 : tarjetas="credito";break;
        }
        tarjeta.setTipo_tarjeta_2(tarjetas);
        tarjeta.setNumero_tarjeta(478376);
        //if(incrementar cliente para cambiar el numero de la tarjeta y de la cuanta de banco//
        System.out.println("ingrese el banco de su preferencia");
        banco.setBanco(leer.nextLine());
        banco.setBanco(leer.nextLine());
        banco.setNumero_cuenta(98713465);
        banco.setSaldo_disponible(3567000);
        System.out.println("su cuenta es: "+banco.getNumero_cuenta());
        System.out.println("su saldo es:"+banco.getSaldo_disponible());
        System.out.println();
        System.out.println("puedes (retirar)  (depositar)  (transaccion)");
        System.out.println("seleccione una opcion");
        System.out.println("(1)retirar  (2)depositar  (3)transaccion");
        transaccion.setTransaccion(leer.nextInt());
        
        while( transaccion.getTransaccion()<1|| transaccion.getTransaccion()>3)
        {
        	System.out.println("valor incorrecto");
        	System.out.println("seleccione una opcion");
            System.out.println("(1)retirar  (2)depositar  (3)transaccion");
            transaccion.setTransaccion(leer.nextInt());
         
        }
        String opcion=null;
        switch(transaccion.getTransaccion())
        {
          case 1 : opcion="retiro";break;
	      case 2 : opcion="deposito";break;
	      case 3 : opcion="transaccion";break;
        }
        transaccion.setTransaccion_2(opcion);
        if(transaccion.getTransaccion()==1)
        {
        	double retiro=0;
        	System.out.println("tu saldo es: "+banco.getSaldo_disponible());
        	System.out.println("lo maximo que puedes retirar es: "+banco.getSaldo_disponible());
        	System.out.println("cuanto quieres retirar:");
        	retiro = leer.nextDouble();
        	while(retiro<1||retiro>banco.getSaldo_disponible())
        	{
        		System.out.println("valor incorrecto");
        		System.out.println("no puedes retirar mas de lo que tienes");
        		System.out.println("cuanto quieres retirar:");
            	retiro = leer.nextDouble();
        	}
            banco.setSaldo_disponible(banco.getSaldo_disponible()- retiro);
            System.out.println("retiro exitoso");
            System.out.println("tu saldo es: "+banco.getSaldo_disponible());
        }
        else if(transaccion.getTransaccion()==2)
        {
        	double deposito=0;
        	System.out.println("tu saldo es: "+banco.getSaldo_disponible());
        	System.out.println("cuanto quieres consignar");
        	deposito=leer.nextDouble();
        	while(deposito<1||deposito>banco.getSaldo_disponible()*20)
        	{
        		System.out.println("valor incorrecto");
        		System.out.println("sobrepasa los limites");
        		System.out.println("cuanto quieres consignar");
            	deposito=leer.nextDouble();
        	}
        	banco.setSaldo_disponible(banco.getSaldo_disponible()+deposito);
        	System.out.println("deposito exitoso");
        	System.out.println("tu saldo es: "+banco.getSaldo_disponible());
        }
        else if(transaccion.getTransaccion()==3)
        {
        	int opcion_banco=0;
        	System.out.println("orpima una opcion");
        	System.out.println("(1)nuestro banco (2)otros bancos");
        	opcion_banco=leer.nextInt();
        	while(opcion_banco<1||opcion_banco>2)
        	{
        		System.out.println("valor incorrecto");
        		System.out.println("orpima una opcion");
            	System.out.println("(1)nuestro banco (2)otros bancos");
            	opcion_banco=leer.nextInt();
        	}
        	int banco_escojido=0;
        	String banco_cual=null;
        	switch(opcion_banco)
        	{
        	case 1:banco_escojido=1;banco_cual="nuestro banco";break;
        	case 2:banco_escojido=2;banco_cual="otros bancos";break;
        	}
        	if(banco_escojido==1)
        	{
        		double cuenta_nueva=0;
        		System.out.println("pasar plata a una cuenta de nuestro mismo banco");
        		System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
        		cuenta_nueva=leer.nextDouble();
        		while(cuenta_nueva==banco.getNumero_cuenta())
        		{
        			System.out.println("no se pueden hacer transacciones a su misma cuenta");
        			System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
            		cuenta_nueva=leer.nextDouble();
        		}
        		int a2=0;
        		System.out.println("verifique la cuenta: "+cuenta_nueva);
        		System.out.println("(1)bien  (2)mal");
        		a2=leer.nextInt();
        		while(a2<1||a2>2)
        		{
        			System.out.println("valor incorrecto");
        			System.out.println("verifique la cuenta: "+cuenta_nueva);
            		System.out.println("(1)bien  (2)mal");
            		a2=leer.nextInt();
        		}
        		if(a2==2)
        		{
        			System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
            		cuenta_nueva=leer.nextDouble();
            		while(cuenta_nueva==banco.getNumero_cuenta())
            		{
            			System.out.println("no se pueden hacer transacciones a su misma cuenta");
            			System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
                		cuenta_nueva=leer.nextDouble();
            		}
        		}
        		System.out.println("verifique la cuenta: "+cuenta_nueva);
        		System.out.println("(1)bien  (2)mal");
        		a2=leer.nextInt();
        		while(a2<1||a2>2)
        		{
        			System.out.println("valor incorrecto");
        			System.out.println("verifique la cuenta: "+cuenta_nueva);
            		System.out.println("(1)bien  (2)mal");
            		a2=leer.nextInt();
        		}
        		if(a2==2)
        		{
        			System.out.println("demaciados intentos");
        			System.out.println("reiniciar");
        			//poner algo para que el programa termine
        		}
        		double dinero=0;
        		System.out.println("tu saldo es: "+banco.getSaldo_disponible());
        		System.out.println("cuanto dinero quieres transferir");
        		dinero=leer.nextDouble();
        		while(dinero>banco.getSaldo_disponible())
        		{
        			System.out.println("tu saldo es: "+banco.getSaldo_disponible());
        			System.out.println("no puedes trasnferir mas dinero del que tienes\n");
        			System.out.println("cuanto dinero quieres transferir");
            		dinero=leer.nextDouble();
        		}
        		System.out.println("transaccion exitosa");
        		System.out.println("transferiste: "+dinero+" a la cuenta: "+cuenta_nueva);
        		banco.setSaldo_disponible(banco.getSaldo_disponible()-dinero);
        		System.out.println("te quedo un saldo de: "+banco.getSaldo_disponible());
        	}
        	if (banco_escojido==2)
        	{
        		    String nuevo_banco=null;
        			System.out.println("quieres hacer una transaccion a un banco diferente?");
        			System.out.println("a que banco desea hacer la transaccion:");
        			nuevo_banco=leer.nextLine();
        			nuevo_banco=leer.nextLine();
        			double cuenta_nueva2=0;
        			System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
            		cuenta_nueva2=leer.nextDouble();
            		while(cuenta_nueva2==banco.getNumero_cuenta())
            		{
            			System.out.println("no se pueden hacer transacciones a su misma cuenta");
            			System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
                		cuenta_nueva2=leer.nextDouble();
            		}
            		int a2=0;
            		System.out.println("verifique la cuenta: "+cuenta_nueva2);
            		System.out.println("(1)bien  (2)mal");
            		a2=leer.nextInt();
            		while(a2<1||a2>2)
            		{
            			System.out.println("valor incorrecto");
            			System.out.println("verifique la cuenta: "+cuenta_nueva2);
                		System.out.println("(1)bien  (2)mal");
                		a2=leer.nextInt();
            		}
            		if(a2==2)
            		{
            			System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
                		cuenta_nueva2=leer.nextDouble();
                		while(cuenta_nueva2==banco.getNumero_cuenta())
                		{
                			System.out.println("no se pueden hacer transacciones a su misma cuenta");
                			System.out.println("dijite el numero de la cuenta a la cual se ara la transaccion:");
                    		cuenta_nueva2=leer.nextDouble();
                		}
            		}
            		System.out.println("verifique la cuenta: "+cuenta_nueva2);
            		System.out.println("(1)bien  (2)mal");
            		a2=leer.nextInt();
            		while(a2<1||a2>2)
            		{
            			System.out.println("valor incorrecto");
            			System.out.println("verifique la cuenta"+cuenta_nueva2);
                		System.out.println("(1)bien  (2)mal");
                		a2=leer.nextInt();
            		}
            		if(a2==2)
            		{
            			System.out.println("demaciados intentos");
            			System.out.println("reiniciar");
            			//poner algo para que el programa termine
            		}
            		double dinero2=0;
            		System.out.println("tu saldo es: "+banco.getSaldo_disponible());
            		System.out.println("cuanto dinero quieres transferir");
            		dinero2=leer.nextDouble();
            		while(dinero2>banco.getSaldo_disponible())
            		{
            			System.out.println("tu saldo es: "+banco.getSaldo_disponible());
            			System.out.println("no puedes trasnferir mas dinero del que tienes\n");
            			System.out.println("cuanto dinero quieres transferir");
                		dinero2=leer.nextDouble();
            		}
            		System.out.println("transaccion exitosa");
            		System.out.println("transferiste: "+dinero2+" a la cuenta: "+cuenta_nueva2+" al banco: "+nuevo_banco);
            		banco.setSaldo_disponible(banco.getSaldo_disponible()-dinero2);
            		System.out.println("te quedo un saldo de: "+banco.getSaldo_disponible());
        	}
        }
        
 
        System.out.println("\n   ----------------------------------------");
        System.out.println(" /");
        System.out.println("----------------------------------------");
        System.out.println("| su cajero: "+cajero.getNombre_cajero()+" #: "+cajero.getNumero_cajero());//+"   |");
        System.out.println("| le agradece por su: "+transaccion.getTransaccion_2());//+"      |");
        System.out.println("|---------------------------------------");
        System.out.println("| usuario: "+cliente.getUsuario());//+"                            |");
        System.out.println("| clave: "+cliente.getClave());//+"                           |");
        System.out.println("| tipo de persona: "+cliente.getTipo_persona());//+"                   |");
        System.out.println("| cual: "+cliente.getTipo_persona_2());//+"               |");
        System.out.println("| tipo de tarjeta: "+tarjeta.getTipo_trajeta());//+"                   |");
        System.out.println("| cual: "+tarjeta.getTipo_tarjeta_2());//+"                        |");
        System.out.println("| numero de tarjeta: "+tarjeta.getNumero_tarjeta());//+"          |");
        System.out.println("| banco: "+banco.getBanco());//+"                           |");
        System.out.println("| numero de cuenta: "+banco.getNumero_cuenta());//+"        |");
        System.out.println("| saldo disponible: "+banco.getSaldo_disponible());//+"          |"); 
        System.out.println("----------------------------------------");
        
        System.out.println("Ingrese (1) para salir o cualquier numero para una nueva accón: ");
        numero = ops.nextInt();
        
        
        ArrayList<String> Datos = new ArrayList<>();
    	{
    	Datos.add("Nombre cajero: "+cajero.getNombre_cajero());
    	Datos.add("Numero de cajero: "+(cajero.getNumero_cajero()));
    	Datos.add("Transacción: "+transaccion.getTransaccion_2());
    	Datos.add("Usuario: "+cliente.getUsuario());
    	Datos.add("Clave: "+cliente.getClave());
    	Datos.add("Tipo persona: "+String.valueOf(cliente.getTipo_persona()));
    	Datos.add("Tipo persona: "+cliente.getTipo_persona_2());
    	Datos.add("Tipo tarjeta: "+tarjeta.getTipo_trajeta());
    	Datos.add("Tipo tajeta: "+tarjeta.getTipo_tarjeta_2());
    	Datos.add("Numero tarjeta: "+tarjeta.getNumero_tarjeta());
    	Datos.add("Su banco es: "+banco.getBanco());
    	Datos.add("Numero de cuenta: "+banco.getNumero_cuenta());
    	Datos.add("Saldo disponible: "+banco.getSaldo_disponible());
    	
    	try {
            FileWriter writer = new FileWriter("datos.txt");
            for (String dato : Datos) {
                writer.write(dato + "\n");
            }
          
            writer.close();
            System.out.println("Datos guardados en datos.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }
    	}
    	
		}while(numero != 1);
		System.out.println("Ha finalizado exitosamente.");
	}
}
	
	
