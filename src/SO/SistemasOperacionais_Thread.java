package SO;

import java.util.Random;

public class SistemasOperacionais_Thread extends Somador {

    public static void main(String[] args) throws InterruptedException {

        Random gerador = new Random();
        int vet[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            vet[i] = gerador.nextInt(9);
        }

        Somador t1 = new Somador();
        t1.setPriority(MIN_PRIORITY);
        t1.setV(vet);

        Somador t2 = new Somador();
        t2.setPriority(MAX_PRIORITY);
        t2.setV(vet);

        Somador t3 = new Somador();
        t3.setPriority(MAX_PRIORITY);
        t3.setV(vet);

        Somador t4 = new Somador();
        t4.setPriority(NORM_PRIORITY);
        t4.setV(vet);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(t1.getTotal() + t2.getTotal() + t3.getTotal() + t4.getTotal());

    }
}
