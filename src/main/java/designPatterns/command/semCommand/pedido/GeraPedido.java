package designPatterns.command.semCommand.pedido;

import designPatterns.command.semCommand.desconto.CalculaDesconto;
import designPatterns.command.semCommand.imposto.CalculadoraImpostos;
import designPatterns.command.semCommand.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidade;


    public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer quantidade) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidade = quantidade;
    }

    public void executar(){
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidade);
        Pedido pedido = new Pedido(this.cliente, LocalDate.now(), orcamento);
    }
}
