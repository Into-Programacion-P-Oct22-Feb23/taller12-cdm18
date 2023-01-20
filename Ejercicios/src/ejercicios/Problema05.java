/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author reroes
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] dataFinal = new int[6];

        for (int i = 0; i < dataInicial.length; i++) {

            dataFinal[i] = entero(dataInicial[i]);
        }
        for (int i = 0; i < dataInicial.length; i++) {

            System.out.println(dataFinal[i]);
        }
    }

    public static int entero(String a) {
        int entero;      
        entero = NumberUtils.toInt(a);
        return entero;
    }
}
