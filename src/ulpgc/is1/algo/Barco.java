package ulpgc.is1.algo;

public class Barco {
    private int eslora;
    private int palos;

    public Barco(int eslora, int palos) {
        this.eslora = eslora;
        this.palos = palos;
    }

    public int getEslora() {
        return eslora;
    }

    public int getPalos() {
        return palos;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setPalos(int palos) {
        this.palos = palos;
    }
}
