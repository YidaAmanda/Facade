package br.fastfood.model;

public class Bebida implements ItemCombo {
    private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Bebida CocaCola() {
        return new Bebida("Coca-Cola", 8.0);
    }

    public static Bebida Nana() {
        return new Bebida("Guaraná", 7.0);
    }

    public String getNome()  {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override public String toString() { return nome + " R$" + preco; }
}
