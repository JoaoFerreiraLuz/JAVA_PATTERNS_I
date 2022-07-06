package designPatterns.command.comCommand.pedido;

import java.math.BigDecimal;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidade;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer quantidade) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidade = quantidade;
    }

    public String getCliente() {return cliente;}
    public BigDecimal getValorOrcamento() {return valorOrcamento;}
    public Integer getQuantidade() { return quantidade;}

    public void executa(){
    }

}
