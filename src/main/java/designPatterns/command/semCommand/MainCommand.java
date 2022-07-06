package designPatterns.command.semCommand;

import designPatterns.command.semCommand.pedido.GeraPedido;

import java.math.BigDecimal;

public class MainCommand {

    public static void main(String[] args){

        String cliente = "joao";
        BigDecimal valorPedido = new BigDecimal("1200");
        Integer quantidade = 5;

        GeraPedido geraPedido = new GeraPedido(cliente, valorPedido, quantidade);
//        GeraPedidoRendler handler = new GeraPedidoRendler(/*repositori, etc envio de e-mails*/);
//        handler.execute(geraPedido);
        System.out.println("------------------------------------------------------------------------------");

    }
}
