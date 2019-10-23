package SO;

public class Somador extends Thread {
    private long total = 0;
    int v[];

    public Somador() {
        this.v = new int[100000];
    }

    public long getTotal() {
        return total;
    }

    public void run() {

        System.out.println("\nNome: " + Thread.currentThread().getName());
        System.out.println("Prioridade: " + Thread.currentThread().getPriority());

        for (int i = 0; i < 100000; i++) {
            total += v[i];
        }
    }
}
