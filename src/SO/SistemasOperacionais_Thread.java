/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SO;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class SistemasOperacionais_Thread extends Somador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random gerador = new Random();

        Somador somador1 = new Somador();
        somador1.setPriority(MIN_PRIORITY);

        Somador somador2 = new Somador();
        somador2.setPriority(NORM_PRIORITY);

        Somador somador3 = new Somador();
        somador3.setPriority(MAX_PRIORITY);

        Somador somador4 = new Somador();
        somador4.setPriority(MAX_PRIORITY);

        for (int i = 0; i < 100; i++) {
            somador1.vetor[i] = gerador.nextInt(9);
        }

        somador1.start();
        somador2.start();
        somador3.start();
        somador4.start();

    }

}
