package br.fastfood.facade;
import br.fastfood.model.Combo;
import br.fastfood.model.ItemCombo;

public class ComboFacade {
    Combo combo;

    public void criarCombo(int codigoCombo){
        switch (codigoCombo) {
            case 1:
                combo = Combo.Master();
                break;
            case 2:
                combo = Combo.Super();
                break;
            default:
                System.out.println("Código inválido.");
        }
    }

    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo selecionado.");
            return;
        }

        for (ItemCombo item : combo.getItens()) {
            System.out.printf("%s - R$ %.2f\n", item.getNome(), item.getPreco());
        }
    }

    public double getPrecoTotal() {
        if (combo == null) {
            return 0.0;
        }

        return combo.getPrecoTotal();
    }
}
