/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Producto;

/**
 *
 * @author Javier Santibañez
 */
public class Venta {
    
    private Producto producto;
    int cord1, cord2, cant;
    public int monto;
    public String nombre;
    
    public Venta(Producto producto){
        this.producto=producto;
    }

   
    public void setCoordenada1(int c1){
        this.cord1 = c1;
        
    }
    
    public void setCoordenada2(int c2){
        this.cord2 = c2;
        
    }
    public void setCantidad(int c){
        this.cant = c;
        
    }
    
    
    
    Producto aux = new Producto();
    
    public void calcular(int co1, int co2,int cantidad){  
       
        System.out.println("precio"+producto.getPrecio(co1, co2));
       monto = producto.getPrecio(co1, co2) * cantidad;    
        System.out.println("calculado "+monto);
        
    }
    
    public int getMonto(){
        return monto;
    }
    
    
}
