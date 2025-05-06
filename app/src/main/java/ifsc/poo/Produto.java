package ifsc.poo;

public class Produto {

    private final String codigoIdentificador;
    private String nome;
    private int preco;
    private int taxaDesconto;
    private int precoAnterior;
    private double precoComDesconto;

    private static int totalProdutos = 0;

    public Produto(String nome, int preco) {
        totalProdutos++;

        verificarNome(nome);
        verificarPreco(preco);
        this.taxaDesconto = 0;
        this.precoAnterior = preco;

        this.codigoIdentificador = gerarCodigoIdentificador();

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        verificarNome(nome);
    }

    public double getPreco() {
        return this.precoComDesconto;
    }

    public void setPreco(int preco) {
        verificarPreco(preco);
        calcularPrecoComDesconto();
    }

    public int getTaxaDesconto() {
        return this.taxaDesconto;
    }

    public void setTaxaDesconto(int taxaDesconto) {
        verificarTaxaDesconto(taxaDesconto);
        calcularPrecoComDesconto();
    }

    public String getCodigo() {
        return this.codigoIdentificador;
    }

    private void verificarNome(String nome) {
        if (nome.trim().isEmpty())  {
            this.nome = "Item Desconhecido";
        } else {
            this.nome = nome;
        }
    }

    private void verificarPreco(int preco) {
        this.precoAnterior = this.preco;
        if (preco < 1) {
            this.preco = 1;
        } else {
            this.preco = preco;
        }
    }

    private void calcularPrecoComDesconto() {
        if (this.taxaDesconto > 0 && this.taxaDesconto < 100) {
            this.precoComDesconto = this.preco - (this.preco * (this.taxaDesconto / 100.0)); // Problema: divisão entre int e double
        }
    }

    private void verificarTaxaDesconto(int taxaDesconto) {
        if (taxaDesconto < 0) {
            this.taxaDesconto = 0;
        } else if (taxaDesconto > 100) {
            this.taxaDesconto = 100;
        } else {
            this.taxaDesconto = taxaDesconto;
        }
    }

    private String gerarCodigoIdentificador() {

        String parteNumerica = String.format("%06d", totalProdutos);
        String parteFormatada = parteNumerica.substring(0,3) + "-" + parteNumerica.substring(3);

        return "CD:" + parteFormatada;
    }

    public String anunciar() {
        return this.nome + ": de R$ " + String.format("%.2f", (double) this.precoAnterior) + " por APENAS R$ " + this.precoComDesconto + "!";
    }
}