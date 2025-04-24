package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Sobremesa Bolo() {
        return new Sobremesa("Bolo", 4.0);
    }

    public static Sobremesa Acai() {
        return new Sobremesa("Açaí", 20.0);
    }

    public String getNome()  {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override public String toString() { return nome + " R$" + preco; }
}
