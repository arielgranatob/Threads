package SO;

public class Somador extends Thread {

    private int inicio = 0, fim = 0, total = 0, vet[];

    public Somador(int v[], int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.vet = v;
    }

    public long getTotal() {
        return total;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fim; i++) {
            total += vet[i];
        }
    }
}
