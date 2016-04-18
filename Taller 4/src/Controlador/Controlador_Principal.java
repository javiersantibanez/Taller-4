/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Vista_Principal;
import Modelo.Venta;
import Modelo.Producto;
import Vista.Vista_Cobro;

/**
 *
 * @author Javier Santibañez
 */
public class Controlador_Principal {
    

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vista_Principal vprincipal = new Vista_Principal();
        Vista_Cobro vcobro = new Vista_Cobro();
        Producto productos =new Producto();
        Venta venta = new Venta(productos);
        
        Controlador_Cobro controlador = new Controlador_Cobro(venta,vprincipal,vcobro);
        vprincipal.setVisible(true);
    }
  
}
