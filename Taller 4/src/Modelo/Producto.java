/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Venta;

/**
 *
 * @author Javier Santibañez
 */
public class Producto {
    
    
    String nonmbre;
    int precio;
    
    int precios[][] = {{1000,650,700},
                       {250,1500,700},
                       {700,2000,700},
                       {500,1000,700}};
    
    
    
    String nombres [][] = {{"Hamburgesa","Churrasco solo","Coca-Cola"},
                            {"Papas fritas","Churrasco Italiano","Fanta"},
                            {"Completo","Pollo Italiano","Sprite"},
                            {"Italiano","Pollo solo","Agua mineral"}};

    
    
    
    public int buscar_p(int a, int b){
        
        precio = precios[a][b];
        
        
        return precio;
    }
    }

