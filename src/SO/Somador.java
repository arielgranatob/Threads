package SO;

public class Somador extends Thread {

    private long total;
    private int v[];

    public Somador() {
        this.v = new int[100000];
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public long getTotal() {
        return total;
    }

    public void run() {
        
        for (int i = 0; i < 100000; i++) {
            total += v[i];
        }
    }
}
