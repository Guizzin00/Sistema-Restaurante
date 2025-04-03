package Pedido;

import Restaurante.ItemMenu;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<ItemMenu> itens;
    private String data;

    public Pedido(int numeroPedido, String data) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemMenu item) {
        itens.add(item);
    }

    public float calcularTotal() {
        float total = 0;
        for (ItemMenu item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirDetalhesPedido() {
        System.out.println("\n📋 Pedido #" + numeroPedido);
        System.out.println("Data: " + data);
        System.out.println("Itens do Pedido:");
        for (ItemMenu item : itens) {
            item.exibirDetalhes();
            System.out.println("===========================================");
        }
        System.out.println("💰 Total do Pedido: R$" + calcularTotal());
    }
}
