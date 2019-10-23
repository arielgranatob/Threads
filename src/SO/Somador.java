package SO;

public class Somador extends Thread {
    private long total;
    private int vet[];

    public Somador() {
        this.vet = new int[100000];
    }

    public long getTotal() {
        return total;
    }
    
    public void setV(int[] vet) {
        this.vet = vet;
    }

    @Override
    public void run() {        
        for (int i = 0; i < 100000; i++) {
            total += vet[i];
        }
    }
}
