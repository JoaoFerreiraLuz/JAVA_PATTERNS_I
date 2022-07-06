package designPatterns.command.comCommand.pedido.acao;

import designPatterns.command.comCommand.pedido.Pedido;

public interface AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido);
}
