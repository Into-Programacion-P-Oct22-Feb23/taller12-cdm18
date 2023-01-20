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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];

        for (int i = 0; i < bases.length; i++) {

            resultado[i] = obtenerPotencias(bases[i], potencias[i]);
        }

        for (int i = 0; i < resultado.length; i++) {

            System.out.println(resultado[i]);
        }

    }

    public static double obtenerPotencias(double a, double b) {
        if (b == 1) {
            return a;
        } else {

            return a * obtenerPotencias(a, b - 1);
        }
    }
}
