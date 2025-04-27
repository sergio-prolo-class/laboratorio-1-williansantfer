package ifsc.poo;

public class Pessoa {
    
    private String nome;
    private int idade;

    private static int totalPessoas = 0;

    public Pessoa(String nome) {
        if (nome.trim().isEmpty())  {
            this.nome = "Fulano";
        } else {
            this.nome = nome;
        }
        totalPessoas++;
    }

    public Pessoa(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
        totalPessoas++;
    }

    public Pessoa(String nome, int idade) {
        if (nome.trim().isEmpty())  {
            this.nome = "Fulano";
        } else {
            this.nome = nome;
        }
        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
        totalPessoas++;
    }

    public static int getTotal() {
        return totalPessoas;
    }

    public void setNome(String nome) {

        if (nome.trim().isEmpty())  {
            this.nome = "Fulano";
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {

        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void felizAniversario() {
        idade++;
    }
}