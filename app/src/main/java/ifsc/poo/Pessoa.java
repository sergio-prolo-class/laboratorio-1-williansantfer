package ifsc.poo;

public class Pessoa {
    
    private String nome;
    private int idade;

    // Estáticos
    private static int totalPessoas = 0;

    // Constantes
    private static final String NOME_PADRAO = "Nome faltando";
    private static final int IDADE_PADRAO = 0;

    public Pessoa(String nome) {
        this.verificarNome(nome);
        this.idade = IDADE_PADRAO;
        totalPessoas++;
    }

    public Pessoa(int idade) {
        this.nome = NOME_PADRAO;
        this.verificarIdade(idade);
        totalPessoas++;
    }

    public Pessoa(String nome, int idade) {
        this.verificarNome(nome);
        this.verificarIdade(idade);
        totalPessoas++;
    }

    public static int getTotalPessoas() {
        return totalPessoas;
    }

    public void setNome(String nome) {
        verificarNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        verificarIdade(idade);
    }

    public int getIdade() {
        return this.idade;
    }

    public void felizAniversario() {
        this.idade++;
    }

    private void verificarIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = IDADE_PADRAO;
        }
    }

    private void verificarNome(String nome) {
        if (nome.trim().isEmpty())  {
            this.nome = NOME_PADRAO;
        } else {
            this.nome = nome;
        }
    }

}