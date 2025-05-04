package ifsc.poo;

public class Pessoa {
    
    private String nome;
    private int idade;

    private static int totalPessoas = 0;

    public Pessoa(String nome) {
        this.verificarNome(nome);
        this.idade = 0;
        totalPessoas++;
    }

    public Pessoa(int idade) {
        this.nome = "Fulano";
        this.verificarIdade(idade);
        totalPessoas++;
    }

    public Pessoa(String nome, int idade) {
        this.verificarNome(nome);
        this.verificarIdade(idade);
        totalPessoas++;
    }

    public static int getTotal() {
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
        idade++;
    }

    private void verificarIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    private void verificarNome(String nome) {
        if (nome.trim().isEmpty())  {
            this.nome = "Fulano";
        } else {
            this.nome = nome;
        }
    }

}