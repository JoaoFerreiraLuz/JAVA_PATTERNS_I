package designPatterns.command.comCommand.pedido.acao;

import designPatterns.command.comCommand.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido {

    public void salvandoPedidoBancoDados(Pedido pedido){
        System.out.println("salvado pedido banco de dados");
    }

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("salvando pedido");
    }
}
