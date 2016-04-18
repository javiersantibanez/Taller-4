/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import Vista.Vista_Principal;

public class Controlador_Cobro {
    
    Venta monto = new Venta();
    
    
    public void set_datos(int coord1, int coord2, int cant){
        
     monto.setCoordenada1(coord1);
     monto.setCoordenada2(coord2);
     monto.setCantidad(cant);
        
    }
    
    public int calcular(){
       
        int total =monto.calcular_monto();

       
     return total;
    }
    
   
    
    
}
