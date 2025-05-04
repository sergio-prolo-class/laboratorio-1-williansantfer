package ifsc.poo;

public class Navio {

    private int tamanho;
    private int[][] posicao;
    private String orientacao;
    private String letra;
    private int[] posicoesAtingidas;
    private boolean afundado;

    public Navio(int tamanho, String orientacao, String letra) {
        this.tamanho = tamanho;
        this.orientacao = orientacao;
        this.letra = letra;
        this.afundado = false;
        this.posicao = new int[tamanho][2];
        this.posicoesAtingidas = new int[tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public String getLetra() {
        return letra;
    }

    public void definirPosicoes(int[][] posicoes) {
        for (int i = 0; i < tamanho; i++) {
            this.posicao[i] = posicoes[i];
        }
    }

    public boolean verificarSeFoiAfundado() {
        for (int i = 0; i < tamanho; i++) {
            if (posicoesAtingidas[i] == 0) {
                return false;
            }
        }
        this.afundado = true;
        return true;
    }

    public String verificarEstadoDoNavio() {
        if (afundado) {
            return "Afundou!";
        } else {
            return "Não afundou.";
        }
    }
}