package designPatterns.command.comCommand;

import designPatterns.command.comCommand.pedido.GeraPedido;
import designPatterns.command.comCommand.pedido.GeraPedidoHendler;
import designPatterns.command.comCommand.pedido.acao.EnviarEmailPedido;
import designPatterns.command.comCommand.pedido.acao.SalvarPedidoBancoDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class MainCommand {

    public static void main(String[] args){

        String cliente = "joao";
        BigDecimal valorPedido = new BigDecimal("1200");
        Integer quantidade = 5;

        /**
         * Padrão observer
         */
        GeraPedido geraPedido = new GeraPedido(cliente, valorPedido, quantidade);
        GeraPedidoHendler handler = new GeraPedidoHendler(
                Arrays.asList(new SalvarPedidoBancoDados(), new EnviarEmailPedido())
        );
        handler.execute(geraPedido);
        System.out.println("------------------------------------------------------------------------------");

    }
}
