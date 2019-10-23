package SO;

import java.util.Random;

public class SistemasOperacionais_Thread extends Somador {

    public static void main(String[] args) throws InterruptedException {

        Random gerador = new Random();
        int vet[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            vet[i] = gerador.nextInt(9);
        }

        Somador s1 = new Somador();
        s1.setPriority(MIN_PRIORITY);
        s1.setV(vet);

        Somador s2 = new Somador();
        s2.setPriority(MAX_PRIORITY);
        s2.setV(vet);

        Somador s3 = new Somador();
        s3.setPriority(MAX_PRIORITY);
        s3.setV(vet);

        Somador s4 = new Somador();
        s4.setPriority(NORM_PRIORITY);
        s4.setV(vet);

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        s1.join();
        s2.join();
        s3.join();
        s4.join();

        System.out.println(s1.getTotal() + s2.getTotal() + s3.getTotal() + s4.getTotal());
    }
}
