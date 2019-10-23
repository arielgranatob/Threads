package SO;

import java.util.Random;

public class SistemasOperacionais_Thread extends Somador {

    public static void main(String[] args) throws InterruptedException {

        Random gerador = new Random();
        int vet[] = new int[100000];
        for (int i = 0; i < 10; i++) {
            vet[i] = gerador.nextInt(9);
        }

        Somador t1 = new Somador();
        t1.setName("Tarefa1");
        t1.setPriority(MIN_PRIORITY);
        t1.v = vet;

        Somador t2 = new Somador();
        t2.setName("Tarefa2");
        t2.setPriority(MAX_PRIORITY);
        t2.v = vet;

        Somador t3 = new Somador();
        t3.setName("Tarefa3");
        t3.setPriority(MAX_PRIORITY);
        t3.v = vet;

        Somador t4 = new Somador();
        t4.setName("Tarefa4");
        t4.setPriority(NORM_PRIORITY);
        t4.v = vet;

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Total: " + (t1.getTotal() + t2.getTotal() + t3.getTotal() + t4.getTotal()));

    }

    public SistemasOperacionais_Thread() {
        super();
    }

}

//https://www.devmedia.com.br/threads-paralelizando-tarefas-com-os-diferentes-recursos-do-java/34309
