package televisor;
import java.util.Scanner;
public class Aplicaciontv {

	public static void main(String[] args) {
		int e;
		String entradas=null;
		Scanner ler = new Scanner(System.in);
		Clasetv tv1 = new Clasetv ();
		int encendido;
		System.out.println("ingrese la marca del televisor ");
		tv1.setMarca(ler.nextLine());
		System.out.println("ingrese el tamaño del televisor en pulgadas");
		tv1.setTamaño(ler.nextInt());
		System.out.println("(1)encendido, (2)apagado");
		tv1.setEncendido(ler.nextInt());
		encendido=tv1.getEncendido();
		while(encendido<1||encendido>2)
		{
			System.out.println("valor no valido, ingreselo nuevamente");
			System.out.println("(1)encendido, (2)apagado");
			encendido=ler.nextInt();
		}

        System.out.println("eliga entradas"+"\n 1) (HDMI)"+"\n 2) (AV)"+"\n 3) (TV)");
        tv1.setEntradas(ler.nextInt());
    	while( tv1.getEntradas()<1||tv1.getEntradas()>3)
		{
    		System.out.println("valor no valido, ingreselo nuevamente");
    		 System.out.println("eliga entradas"+"\n 1) (HDMI)"+"\n 2) (AV)"+"\n 3) (TV)");
    		  tv1.setEntradas(ler.nextInt());
		}
    	switch(tv1.getEntradas())
    	{
    	 case 1 : entradas="HDMI";break;
    	 case 2 : entradas="AV";break;
    	 case 3 : entradas="TV";break;
    	}
    	if(encendido==1)
    	{
    		System.out.println("ingrese volumen de 0 - 100");
    		tv1.setVolumen(ler.nextInt());
    		while( tv1.getVolumen()<0||tv1.getVolumen()>100)
    		{
    			System.out.println("valor no valido, ingreselo nuevamente");
    			System.out.println("ingrese volumen de 0 - 100");
        		tv1.setVolumen(ler.nextInt());
    		}
    		System.out.println("ingre un canal de 0 - 100");
    		tv1.setCanal(ler.nextInt());
    		while( tv1.getCanal()<0||tv1.getCanal()>100)
    		{
    			System.out.println("valor no valido, ingreselo nuevamente");
    			System.out.println("ingre un canal de 0 - 100");
        		tv1.setCanal(ler.nextInt());
    		}
    	}
        System.out.println("su televisor es");
        System.out.println();
    	System.out.println("marca:  "+ tv1.getMarca());
    	System.out.println("pulgadas:  "+ tv1.getTamaño());
    
    	if(encendido==1)
    	{
    		System.out.println("encendido");
    		System.out.println(entradas);
    		System.out.println("volumen:  "+ tv1.getVolumen());
    		System.out.println("canal:  "+ tv1.getCanal());
    	}
    	if(encendido==2)
    	{
    		System.out.println("apagado");
    		System.out.println(entradas);
    		System.out.println("el televisor esta apagado, no tiene volumen ni canal");
    	}
	}

}
