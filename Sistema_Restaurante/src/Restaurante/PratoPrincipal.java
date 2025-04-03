package Restaurante;

import java.util.List;

public class PratoPrincipal extends ItemMenu {
    private List<String> ingredientes;
    private int tempoPreparo;
    private String categoria;

    public PratoPrincipal(String nome, float preco, String descricao, List<String> ingredientes, int tempoPreparo, String categoria) {
        super(nome, preco, descricao);
        this.ingredientes = ingredientes;
        this.tempoPreparo = tempoPreparo;
        this.categoria = categoria;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void exibirDetalhes() {
        System.out.println("\n🍽️ Prato Principal: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Categoria: " + categoria);
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
        System.out.println("Tempo de preparo: " + tempoPreparo + " minutos");
    }
}
