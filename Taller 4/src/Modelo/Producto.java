/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Venta;

/**
 * Esta clase contiene los nombre de los productos que se venden y además los precios de estos
 * Es parte de la capa Modelo
 * @author Javier Santibáñez,Franco Soto, José Valdivia
 * @version version 1.0
 */
public class Producto {
    /**
     * Nombre del producto
     */
    String nombre;
    /**
     * Precio del producto
     */
    int precio;
    
    /**
     * Matriz de precios de los productos
     */
    int precios[][] = {{1000,650,700},
                       {250,1500,700},
                       {700,2000,700},
                       {500,1000,700}};
    
    
    /**
     * Matriz de nombres de los productos
     */
    String nombres [][] = {{"Hamburgesa","Churrasco solo","Coca-Cola"},
                            {"Papas fritas","Churrasco Italiano","Fanta"},
                            {"Completo","Pollo Italiano","Sprite"},
                            {"Italiano","Pollo solo","Agua mineral"}};

    /**
     * Constructor de la clase
     */
    public Producto (){}
    
    
    /**
     * Este método obtiene los precios de la matriz de datos
     * @param x Fila
     * @param y Columnas
     * @return Precio del producto
     */
    public int getPrecio(int x, int y){
        return precios[x][y];
    }
    
    /**
     * Este método obtine los nombres de los productos
     * @param x Fila
     * @param y Columna
     * @return Nombre del producto
     */
    
    public String getNombre(int x, int y){
        return nombres[x][y];
    }
    
}

