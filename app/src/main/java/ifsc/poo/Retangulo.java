package ifsc.poo;

public class Retangulo {

    private float largura;
    private float altura;
    private float razaoAreaPerimetro;
    private static float MAIOR_RAZAO = 0;
    private static float LARGURA_MAIOR_RAZAO = 0;
    private static float ALTURA_MAIOR_RAZAO = 0;

    public Retangulo(int largura, int altura) {

        if (largura <= 0 ||  altura <= 0) {
            this.largura = 1;
            this.altura = 1;
        } else {
            this.largura = largura;
            this.altura = altura;
        }

        razaoAreaPerimetro = getArea() / getPerimetro();

        if (razaoAreaPerimetro > MAIOR_RAZAO) {
            MAIOR_RAZAO = razaoAreaPerimetro;
            LARGURA_MAIOR_RAZAO = largura;
            ALTURA_MAIOR_RAZAO = altura;
        }

    }

    public void setLargura(float largura) {
        this.largura = largura;

    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return largura * altura;
    }

    public float getPerimetro() {
        return (largura * 2) + (altura * 2);
    }

    public static String imprimirRetanguloMaiorRazao() {
        return "Retângulo com maior razão - Altura: " + LARGURA_MAIOR_RAZAO + ", Largura: " + ALTURA_MAIOR_RAZAO;
    }
}