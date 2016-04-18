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

public class Controlador_Cobro {
    
    private Venta monto;
    private Vista_Principal vista;
    private Vista_Cobro vista2;
    int montopagar;
    public int total;
    
    public Controlador_Cobro(Venta monto, Vista_Principal vista, Vista_Cobro vista2){
        this.monto=monto;
        this.vista=vista;
        this.vista2=vista2;
        this.vista.botonCalcular(new Calcular());
        this.vista2.botonAtras(new Atras());
        this.vista2.botonIngresarPago(new IngresarPago());
    }

    public void set_datos(int coord1, int coord2, int cant){
        
     monto.setCoordenada1(coord1);
     monto.setCoordenada2(coord2);
     monto.setCantidad(cant);
        
    }
  
    
    class Calcular implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
               int cor1,cor2,cantidad;
               try{
                   System.out.println("cccc");
                   cor1 = vista.getCord1();
                   cor2 = vista.getCord2();
                   total =cantidad = vista.getCantidad();
                   monto.calcular(cor1,cor2,cantidad);
                   vista2.setVisible(true);
                   vista.setVisible(false);
                   vista2.setResultado(monto.getMonto());
               }catch(NumberFormatException ex){
                   System.out.println("error");
               }
            }
    }
    
    class Atras implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a) {
               int cor1,cor2,cantidad,total;
               try{
                   System.out.println("BOTON2");
                   //System.out.println("cccc");
                  // cor1 = vista.getCord1();
                   //cor2 = vista.getCord2();
                   //cantidad = vista.getCantidad();
                  // monto.calcular(cor1,cor2,cantidad);
                   vista2.setVisible(false);
                   vista.setVisible(true);
                  // vista2.setResultado(monto.getMonto());
               }catch(NumberFormatException ex){
                   System.out.println("error");
               }
            }
    }
    class IngresarPago implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
               int cor1,cor2,cantidad;
               try{
                   System.out.println("BOTON3");
                   JFrame frame = new JFrame("JOptionPane showMessageDialog example");  
                   int t,a;
                           a=vista2.getPagoCliente();
                   t=a-vista2.getTotalPedido();
                   System.out.println("pago cliente "+a+"  total "+total);
                   
                    JOptionPane.showMessageDialog(frame, "El vuelto es de "+ t);
               }catch(NumberFormatException ex){
                   System.out.println("error");
               }
            }
    }
    
   
    
    
}
