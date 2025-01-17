package maquina_dinero;

import java.util.Scanner;

public class Maquina_Dinero {

    /**
     * Vamos a hacer una maquina en la que le introduzcas una cifra y te
     * devuelva la minima cantidad de monedas y billetas posibles
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] aBilletes = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200, 500};
        int[] aMoneda = new int[15];

        System.out.println("Buenas, cuanto dinero deseas cambiar?");
        double dinero = teclado.nextDouble();

        for (int i = aMoneda.length - 1; i >= 0; i--) {
            aMoneda[i] = (int) (dinero / aBilletes[i]);
            dinero = dinero % aBilletes[i];
            System.out.println("Monedas de: " + aBilletes[i] + "->" + aMoneda[i]);
        }

        if (dinero > 0.009 && dinero < 0.01) {
            aMoneda[0] = 1;
        }

       


        
        
    }
    
}
