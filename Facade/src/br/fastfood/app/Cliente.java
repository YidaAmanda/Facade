package br.fastfood.app;
import java.util.Scanner;
import br.fastfood.facade.ComboFacade;

public class Cliente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Master");
        System.out.println("2 – Super Combo");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();

        System.out.print("\n");

        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());
    }
}