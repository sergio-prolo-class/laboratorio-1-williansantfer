package ifsc.poo;

public class Lampada {

    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }

    public Lampada(boolean estadoLampada) {
        this.ligada = estadoLampada;
    }

    public void ligar() {
        if (ligada == false) {
            this.ligada = true;
        }
    }

    public void desligar() {
        if (ligada == true) {
            this.ligada = false;
        }
    }

    public boolean verEstado() {
        return this.ligada;
    }
}