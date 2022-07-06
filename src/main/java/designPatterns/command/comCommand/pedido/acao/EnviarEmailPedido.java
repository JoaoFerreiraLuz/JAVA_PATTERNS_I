package designPatterns.command.comCommand.pedido.acao;

import designPatterns.command.comCommand.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executar(Pedido pedico){
        System.out.println("enviando e-mail");
    }

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email");
    }
}
