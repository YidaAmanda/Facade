package br.fastfood.model;

public class Combo {
    private final Burger burger;
    private final ItemCombo bebida;
    private final ItemCombo sobremesa;

    public Combo(Burger burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public static Combo Master() {
        return new Combo(
                Burger.XSalada(),
                Bebida.CocaCola(),
                Sobremesa.Bolo()
        );
    }

    public static Combo Super() {
        return new Combo(
                Burger.CheddarBacon(),
                Bebida.Nana(),
                Sobremesa.Acai()
        );
    }

    public ItemCombo[] getItens() {
        return new ItemCombo[] { burger, bebida, sobremesa };
    }

    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }
}