/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];

        for (int i = 0; i < datos.length; i++) {
            
            suma [i] = obtenerSuma(datos [i], datos2[i]);
        }
        
         for (int i = 0; i < datos.length; i++) {
            
             System.out.println(suma[i]);
        }

    }

    public static double obtenerSuma (double a, double b){
        double suma;       
        
        suma  =a + b;
        return suma;
    }    
    
}
