/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero_1;

/**
 *
 * @author estudiantes
 */
public class Cajero_1 {
    
    public String desconar(int va,int vr)
    {
        String r = null;
        if (va<vr || va<0)
        {
            r = "Fondos insuficientes";
        }else{
            int re = va-vr;
        r = ""+re;
        }
        
        return r;
    }
    
    public String abono(int va,int vr)
    {
        String r = null;
        if (va<vr || va<0)
        {
            r = "Fondos insuficientes";
        }else{
            int re = va+vr;
        r = ""+re;
        }
        
        return r;
    }
    
    public String validacion(String va,String vr)
    {
        String r;
        if (va.equals(vr)){
            r = "Admitido";
    }else
        {
            r= "Acceso denegado";
        }
        return r;
    }
   
    
    

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
}
