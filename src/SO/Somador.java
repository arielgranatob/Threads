package SO;

public class Somador extends Thread {

    private long total;
    private int v[];

    public Somador() {
        this.v = new int[100];
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public long getTotal() {
        return total;
    }

    public void run() {
        
        for (int i = 0; i < 100; i++) {
            total += v[i];
        }
    }
}
