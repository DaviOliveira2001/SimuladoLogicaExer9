/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladologicaexer9;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class SimuladoLogicaExer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero, media;
        media = 0;
        for(int cont = 0; cont <= 15; cont++){
            System.out.println("Digite um número:");
            numero = teclado.nextInt();
            media = cont / 15;
        }
        System.out.println("A média dos números é: "+media);
    }
}
