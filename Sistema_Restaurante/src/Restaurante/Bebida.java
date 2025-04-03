package Restaurante;

public class Bebida extends ItemMenu {
    private String tamanho;
    private boolean alcoolica;
    private String marca;

    public Bebida(String nome, float preco, String descricao, String tamanho, boolean alcoolica, String marca) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.alcoolica = alcoolica;
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exibirDetalhes() {
        System.out.println("\n🥤 Bebida: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Álcool: " + (alcoolica ? "Sim" : "Não"));
        System.out.println("Marca: " + marca);
    }
}
