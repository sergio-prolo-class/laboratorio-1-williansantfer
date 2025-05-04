package ifsc.poo;

public class Retangulo {

    private float largura;
    private float altura;
    private float razaoAreaPerimetro;
    private static float MAIOR_RAZAO = 0;
    private static float LARGURA_MAIOR_RAZAO = 0;
    private static float ALTURA_MAIOR_RAZAO = 0;

    public Retangulo(float largura, float altura) {

        if (largura < 0 ||  altura < 0) {
            this.largura = 1;
            this.altura = 1;
        } else {
            this.largura = largura;
            this.altura = altura;
        }

        calcularRazao(largura, altura);

    }

    public void setLargura(float largura) {
        this.largura = largura;

    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return this.largura * this.altura;
    }

    public float getPerimetro() {
        return (this.largura * 2) + (this.altura * 2);
    }

    public void calcularRazao(float largura, float altura) {
        razaoAreaPerimetro = getArea() / getPerimetro();

        if (razaoAreaPerimetro > MAIOR_RAZAO) {
            MAIOR_RAZAO = razaoAreaPerimetro;
            LARGURA_MAIOR_RAZAO = largura;
            ALTURA_MAIOR_RAZAO = altura;
        }
    }

    public static String imprimirRetanguloMaiorRazao() {
        return "Retângulo com a maior razão área sobre perímero:\n - Razão: " + String.format("%.2f", MAIOR_RAZAO) + 
        ", " + "Largura: "  + String.format("%.2f",LARGURA_MAIOR_RAZAO) + ", Altura: " + String.format("%.2f", ALTURA_MAIOR_RAZAO);
    }
}