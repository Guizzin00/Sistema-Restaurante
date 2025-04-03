package Restaurante;

import Pedido.Pedido;
import java.util.Arrays;

public class Restaurante {

    public static void main(String[] args) {
        titulo();

        PratoPrincipal prato = new PratoPrincipal(
            "Spaghetti à Carbonara", 
            35.50f, 
            "Espaguete com molho cremoso à base de ovos e queijo parmesão.", 
            Arrays.asList("Espaguete", "Ovos", "Queijo Parmesão"), 
            20, 
            "Massas"
        );

        Bebida bebida = new Bebida(
            "Coca-Cola", 
            5.00f, 
            "Refrigerante de cola", 
            "Média", 
            true, 
            "Coca-Cola"
        );

        Pedido pedido = new Pedido(1, "2025-04-03 12:30");

        pedido.adicionarItem(prato);
        pedido.adicionarItem(bebida);

        pedido.exibirDetalhesPedido();
    }

    public static void titulo() {
        System.out.println("\r\n"
        		+ "██████╗░███████╗░██████╗████████╗░█████╗░██╗░░░██╗██████╗░░█████╗░███╗░░██╗████████╗███████╗\r\n"
        		+ "██╔══██╗██╔════╝██╔════╝╚══██╔══╝██╔══██╗██║░░░██║██╔══██╗██╔══██╗████╗░██║╚══██╔══╝██╔════╝\r\n"
        		+ "██████╔╝█████╗░░╚█████╗░░░░██║░░░███████║██║░░░██║██████╔╝███████║██╔██╗██║░░░██║░░░█████╗░░\r\n"
        		+ "██╔══██╗██╔══╝░░░╚═══██╗░░░██║░░░██╔══██║██║░░░██║██╔══██╗██╔══██║██║╚████║░░░██║░░░██╔══╝░░\r\n"
        		+ "██║░░██║███████╗██████╔╝░░░██║░░░██║░░██║╚██████╔╝██║░░██║██║░░██║██║░╚███║░░░██║░░░███████╗\r\n"
        		+ "╚═╝░░╚═╝╚══════╝╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝\r\n"
        		+ "____________________________________________________________________________________________");
    }
}
