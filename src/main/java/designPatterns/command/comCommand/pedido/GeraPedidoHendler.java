package designPatterns.command.comCommand.pedido;

import designPatterns.command.comCommand.orcamento.Orcamento;
import designPatterns.command.comCommand.pedido.acao.AcaoAposGerarPedido;
import designPatterns.command.comCommand.pedido.acao.EnviarEmailPedido;
import designPatterns.command.comCommand.pedido.acao.SalvarPedidoBancoDados;

import java.time.LocalDate;
import java.util.List;

public class GeraPedidoHendler {

    // construtor com injeção de dependencia
    // exemplo repository, service, etc;
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHendler(List<AcaoAposGerarPedido> acoes){
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidade());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
