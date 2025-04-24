package br.fastfood.model;

public class Burger implements ItemCombo {
    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Burger XSalada() {
        return new Burger("X-Salada", 15.0);
    }

    public static Burger CheddarBacon() {
        return new Burger("Cheddar Bacon", 25.0);
    }

    public String getNome()  {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override public String toString() { return nome + " R$" + preco; }
}
