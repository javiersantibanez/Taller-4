/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Vista_Principal;
import Modelo.*;
import Vista.Vista_Cobro;

/**
 * Esta clase es el administrador principal del programa y contiene al main
 * Esta clase pertenece a la capa Controlador
 * @author Javier Santibáñez,Franco Soto, José Valdivia
 * @version version 1.0
 */
public class Controlador_Principal {
    

    /**
     * Este es el metodo main del programa
     * @param args Es un array de String
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vista_Principal vprincipal = new Vista_Principal();
        Vista_Cobro vcobro = new Vista_Cobro();
        Producto productos =new Producto();
        Registro reg = new Registro();
        Venta venta = new Venta(productos,reg);
        
        Controlador_Cobro controlador = new Controlador_Cobro(venta,vprincipal,vcobro);
        vprincipal.setVisible(true);
    }
  
}
