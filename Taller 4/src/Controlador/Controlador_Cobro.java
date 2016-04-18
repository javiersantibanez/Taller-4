/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import Vista.*;


public class Controlador_Cobro {
    
    Venta monto = new Venta();
    Vista_Cobro vista = new Vista_Cobro();
    
    
    public void set_datos(int coord1, int coord2, int cant){
        
     monto.setCoordenada1(coord1);
     monto.setCoordenada2(coord2);
     monto.setCantidad(cant);
     
     vista.setVisible(true);
     int total =monto.calcular_monto();
     String res = Integer.toString(total);
     vista.total_pedido.setText(res);
    }
    
  
    
    
    
    
}
