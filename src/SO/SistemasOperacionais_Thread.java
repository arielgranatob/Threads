package SO;

import java.util.Random;

public class SistemasOperacionais_Thread extends Somador {

    public static void main(String[] args) throws InterruptedException {

        Random gerador = new Random();
        int vet[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            vet[i] = gerador.nextInt(9);
        }

        Somador s1 = new Somador(vet, 0, 25000);
        s1.setPriority(MIN_PRIORITY);

        Somador s2 = new Somador(vet, 25000, 50000);
        s2.setPriority(MAX_PRIORITY);

        Somador s3 = new Somador(vet, 50000, 75000);
        s3.setPriority(MAX_PRIORITY);

        Somador s4 = new Somador(vet, 75000, 100000);
        s4.setPriority(NORM_PRIORITY);

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

    public SistemasOperacionais_Thread(int[] v, int inicio, int fim) {
        super(v, inicio, fim);
    }
}
