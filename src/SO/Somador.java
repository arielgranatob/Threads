/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SO;

/**
 *
 * @author aluno
 */
public class Somador extends Thread {

    int vetor[] = new int[100];

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(vetor[i]);
        }
    }
}
