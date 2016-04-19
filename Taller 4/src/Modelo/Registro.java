/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Component;
import java.io.*;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 * Esta clase registra los datos de la compra en un .txt
 * Es parte de la capa Modelo
 * @author Javier Santibáñez,Franco Soto, José Valdivia
 * @version version 1.0
 */
public class Registro {
    
    /**
     * Atributo de la fecha de venta
     */
    java.util.Date fecha = new Date(); 
    
    /**
     * Constructor de la clase
     */
    public Registro(){}
    
    
    /**
     * Este método escribe sobre un archivo txt
     * @param nombre Nombre de los  productos
     * @param monto Monto de la venta
     */    
    public void escribir( String nombre, int monto){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        
        try{
            f= new File("resgistro_venta.txt");
            w = new FileWriter(f,true);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            bw.newLine();
            wr.write (monto+"  "+ nombre+ "  "+fecha);
            
           
            wr.close();
            bw.close();
           
        }catch(IOException e){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Error al escrbir el archivo");
        }
    }
    

}
    

