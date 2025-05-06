package ifsc.poo;

public class Retangulo {

    private float largura;
    private float altura;
    private float razaoAreaPerimetro;

    // Estáticos

    private static Retangulo retanguloMaior = null;

    private static float maiorRazao = 0;
    private static float larguraMaiorRazao = 0;
    private static float alturaMaiorRazao = 0;

    public Retangulo(float largura, float altura) {

        if (largura <= 0 ||  altura <= 0) {
            this.largura = 1;
            this.altura = 1;
        } else {
            this.largura = largura;
            this.altura = altura;
        }

        if (retanguloMaior == null || this.getArea() / this.getPerimetro() > retanguloMaior.getArea() / retanguloMaior.getPerimetro()) {
            retanguloMaior = this;
        }

        calcularRazao(largura, altura);

    }

    public void setLargura(float largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public float getArea() {
        return this.largura * this.altura;
    }

    public float getPerimetro() {
        return (this.largura * 2) + (this.altura * 2); // return 2 * (this.largura + this.altura)
    }

    public static Retangulo getRetanguloMaior() {
        return retanguloMaior;
    }


    public void calcularRazao(float largura, float altura) {
        razaoAreaPerimetro = getArea() / getPerimetro();

        if (razaoAreaPerimetro > maiorRazao) {
            maiorRazao = razaoAreaPerimetro;
            larguraMaiorRazao = largura;
            alturaMaiorRazao = altura;
        }
    }

    public static String imprimirRetanguloMaiorRazao() {
        return "Retângulo com a maior razão área sobre perímero:\n - Razão: " + String.format("%.2f", maiorRazao) +
        ", " + "Largura: "  + String.format("%.2f",larguraMaiorRazao) + ", Altura: " + String.format("%.2f", alturaMaiorRazao);
    }
}