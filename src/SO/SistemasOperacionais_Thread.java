package SO;

import java.util.Random;

public class SistemasOperacionais_Thread extends Somador {

    public static void main(String[] args) throws InterruptedException {

//        Random gerador = new Random();
//
//        Somador somador1 = new Somador();
//        somador1.setPriority(MIN_PRIORITY);
//
//        Somador somador2 = new Somador();
//        somador2.setPriority(NORM_PRIORITY);
//
//        Somador somador3 = new Somador();
//        somador3.setPriority(MAX_PRIORITY);
//
//        Somador somador4 = new Somador();
//        somador4.setPriority(MAX_PRIORITY);
//
//        for (int i = 0; i < 100; i++) {
//            somador1.vetor[i] = gerador.nextInt(9);
//            somador2.vetor[i] = gerador.nextInt(9);
//            somador3.vetor[i] = gerador.nextInt(9);
//            somador4.vetor[i] = gerador.nextInt(9);
//
//        }
//
//        somador1.start();
//        somador2.start();
//        somador3.start();
//        somador4.start();
        //cria três tarefas
        Somador t1 = new Somador(0, 25000);
        t1.setName("Tarefa1");
        
        t1.setPriority(MIN_PRIORITY);
        Somador t2 = new Somador(25001, 50000);
        t2.setName("Tarefa2");
        t2.setPriority(MAX_PRIORITY);
        
        Somador t3 = new Somador(50001, 75000);
        t3.setName("Tarefa3");
        
        t3.setPriority(MAX_PRIORITY);
        Somador t4 = new Somador(75001, 100000);
        t4.setName("Tarefa4");
        t4.setPriority(NORM_PRIORITY);

        //inicia a execução paralela das três tarefas, iniciando três novas threads no programa
        t1.start();
        t2.start();
        t3.start();
        t4.start();


        t1.join();
        t2.join();
        t3.join();
        t4.join();

        //Exibimos o somatório dos totalizadores de cada Thread
        System.out.println("Total: " + (t1.getTotal() + t2.getTotal() + t3.getTotal() + t4.getTotal()));

    }

    public SistemasOperacionais_Thread(int valorInicial, int valorFinal) {
        super(valorInicial, valorFinal);
    }

}

//https://www.devmedia.com.br/threads-paralelizando-tarefas-com-os-diferentes-recursos-do-java/34309
