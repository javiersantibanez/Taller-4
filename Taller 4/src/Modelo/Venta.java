/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;




/**
 * Esta clase calcula el total de la venta y sirve de enlace hacia la clase Registro y clase Producto
 * Es parte de la capa Modelo
 * @author Javier Santibáñez,Franco Soto, José Valdivia
 * @version version 1.0
 */
public class Venta {
    /**
     * Objeto de la clase Producto
     */
    private Producto producto;
    /**
     * Objeto de la clase Registro
     */
    private Registro reg;
    /**
     * Filas
     */
    int cord1;
    /**
     * Columnas
     */
    int cord2;
    /**
     * Cantidad del producto
     */
    int cant;
    /**
     * Valor del producto por cantidad
     */
    int monto;
    /**
     * Valor total de la venta
     */
    int montoaux;
    /**
     * Iterador
     */
    int i= 0;
    /**
     * Nombre del producto
     */
    String nombre;
    /**
     * Detalle de la venta
     */
    String detalle ="";
    
    
  /**
   * Este constructor de la clase
   * @param producto Es el objeto de la clase Producto
   * @param reg Es el objeto de la clase Registro
   */
    
    public Venta(Producto producto,Registro reg){
        this.producto=producto;
        this.reg=reg;
    }


    /**
     * Este método realiza el calculo total de la venta
     * @param co1 Filas
     * @param co2 Columnas
     * @param cantidad Cantidades del producto 
     */
    public void calcular(int co1[], int co2[],int cantidad[]){  
        for(int p=0 ; p<cantidad.length ; p++){
            if(cantidad[p] != 0){
                monto = producto.getPrecio(co1[p], co2[p]) * cantidad[p];
                montoaux += monto;  
            }
        }
    }
    
    /**
     * Este método busca los nombres de los productos de la venta, además agrega los nombres a la variable detalle
     * @param co1 Filas
     * @param co2 Columnas
     * @param cantidad Cantidades del producto
     */
    public void bNombre(int co1[],int co2[],int cantidad[]){
                
        for(int p=0;p<co1.length;p++){
          
            if(cantidad[p] !=0){
                nombre = producto.getNombre(co1[p], co2[p]);        
                detalle += cantidad[p]+" " + nombre+"   "; 
            }
        }
        reg.escribir(detalle, montoaux);
    }
    
    /**
     * Este método obtiene el valor total de la venta
     * @return Monto total de la venta
     */
    public int  getMonto(){
   
        return montoaux;
    }
    
    /**
     * Este método limpia las variables del monto para una nueva venta 
     * @param x Valor de inicialización
     */
    public void setMonto(int x){
        
        montoaux = x;
        monto =x;
    }
    
    /**
     * Este método limpia las variables del nombre del producto para una nueva venta
     */
    public void vaciarNombre(){
        nombre = "";
        detalle= "";
    }
    
}
