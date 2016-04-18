/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author Javier Santibañez
 */
public class Venta {
    
    int cord1, cord2, cant;
    int monto;
    String fecha;
    String detalle;
   
    public void setCoordenada1(int c1){
        cord1 = c1;
        
    }
    
    public void setCoordenada2(int c2){
        cord2 = c2;
        
    }
    public void setCantidad(int c){
        cant = c;
        
    }
   
   
    
    Producto aux = new Producto();
    
    public int calcular_monto(){  
       
       
       int pre = aux.buscar_p(cord1,cord2);
        
       monto = pre * cant;
       
       
        return monto;
        
    }
    
    
}
