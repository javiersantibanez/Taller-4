/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.*;
import Vista.Vista_Cobro;
import Vista.Vista_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
* Esta clase se encarga de establecer la conexion entre la capa vista y la capa modelo
* Esta clase pertenece a la capa Controlador
* @author Javier Santibáñez,Franco Soto, José Valdivia
* @version version 1.0
*/


public class Controlador_Cobro {
    /**
     * Objeto de la clase Venta
     */
    private Venta venta;
    /**
     * Objeto de la clase Vista_Principal
     */
    private Vista_Principal vista;
    /**
     * Objeto de la clase Vista_Cobro
     */
    private Vista_Cobro vista2;
    /**
     * Iterador
     */
    int i=0;
    /**
     * Arreglo de filas
     */
    int []cor1 = new int [10];
    /**
     * Arreglo de columnas
     */
    int []cor2 = new int [10];
    /**
     * Arreglo que guarda la cantidad de los productos
     */
    int []cantidad = new int [10];
    
    /**
     * Este es el contructor de la clase
     * @param monto Objeto de la clase Venta
     * @param vista Objeto de la clase Vista_Principal
     * @param vista2 Objeto de la clase Vista_Cobro
     */
    public Controlador_Cobro(Venta monto, Vista_Principal vista, Vista_Cobro vista2){
        this.venta=monto;
        this.vista=vista;
        this.vista2=vista2;
        this.vista.botonCalcular(new Calcular());
        this.vista2.botonAtras(new Atras());
        this.vista2.botonIngresarPago(new IngresarPago());
        this.vista.botonAgregar(new Agregar());
    }

    
    /**
     * Esta es una clase abstracta que implementa el boton "Agregar" de la capa Vista
     */
    class Agregar implements ActionListener{

        @Override
        /**
         * Este método captura el evento de precionar el boton "Agregar", es decir, guarda las coordenadas del producto y la cantidad
         */
        public void actionPerformed(ActionEvent e) {
            try{
                if(vista.getCord1() <=3){
                    if(vista.getCord2() <=2){
                        if(vista.getCantidad() >0){
                            cor1[i] = vista.getCord1();
                            cor2[i] = vista.getCord2();
                            cantidad[i] = vista.getCantidad();
                            i++;
                        }
                        else{
                            JOptionPane.showMessageDialog(vista, "Usted ha ingresado una coordenada no valida o cantidad menor a 1");
                        }
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(vista, "Usted ha ingresado una coordenada no valida o cantidad menor a 1");
                        }
                    
                }
                else{
                        JOptionPane.showMessageDialog(vista, "Usted ha ingresado una coordenada no valida o cantidad menor a 1");
                        }
                
                
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(vista, "Error al ingresar los datos o datos insuficientes");
            }
            
        }
        
        
    }
  
    /**
     *  Esta es una clase abstracta que implementa el boton "Ingresar Cobro" de la capa Vista
     */
    class Calcular implements ActionListener{
        @Override
        /**
         * Este método envía los datos de la venta obtenidos de la capa Vista, hacia la capa Modelo para sus posteriores calculos
         */
        public void actionPerformed(ActionEvent e) {
               
                if(cantidad[0] == 0){

                    JOptionPane.showMessageDialog(vista, "No se ha ingresado ningún pedido");
                }
                else{
                
                    venta.calcular(cor1,cor2,cantidad);
                    vista2.setVisible(true);
                    vista.setVisible(false);
                    vista2.setResultado(venta.getMonto());

                }
            }
    }
    
    /**
     *  Esta es una clase abstracta que implementa el boton "Atras" de la capa Vista, perteneciente a la clase Vista_Cobro
     */
    class Atras implements ActionListener{
        @Override
        /**
         * Este método vuelve hacia la vista principal del programa
         */
        public void actionPerformed(ActionEvent a) {
              
               try{

                   vista2.setVisible(false);
                   vista.setVisible(true);
                  
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(vista, "Error al volver a la pagina principal");
               }
            }
    }
    
    /**
     * Esta es una clase abstracta que implementa el boton "Ingresar Pago" de la capa Vista
     */
    class IngresarPago implements ActionListener{
        @Override
        /**
         * Este metodo envía los datos hacia la capa modelo, para calcular el vuelto del cliente y el posterior registro de la venta, además de limpiar las variables para una nueva venta
         */
        public void actionPerformed(ActionEvent e) {
               
               try{
                   
                   JFrame frame = new JFrame("JOptionPane showMessageDialog example");  
                   int t,a;
                   a=vista2.getPagoCliente();
                   t=a-vista2.getTotalPedido();
                   
                   if(a<vista2.getTotalPedido()){
                       JOptionPane.showMessageDialog(frame, "El dinero es insuficiente");
                   }
                   else{
                    JOptionPane.showMessageDialog(frame, "El vuelto es de "+ t);
                    JOptionPane.showMessageDialog(frame, "La venta se realizo correctamente" );
                    
                    
                    venta.bNombre(cor1,cor2,cantidad);
                    
                    
                    
                    venta.setMonto(0);
                    vista2.setPago();
                    for(int x=0;x<10;x++){
                        cor1[x]=0;
                        cor2[x]=0;
                        cantidad[x] =0;
                    }
                    venta.vaciarNombre();
                    i=0; 
                    
                    vista.setVisible(true);
                    vista2.setVisible(false);
                   }
               }catch(NumberFormatException ex){
                   JOptionPane.showMessageDialog(vista, "Caracter no valido");
               }
            }
    }
    
   
    
    
}


