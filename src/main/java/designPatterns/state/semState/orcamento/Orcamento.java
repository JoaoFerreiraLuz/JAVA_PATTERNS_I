package designPatterns.state.semState.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private String situacao;

    public void aplicarDescontoextra(){
        BigDecimal valorDescontoExtra = BigDecimal.ZERO;
        if(situacao.equals("EM ANALISE")){
            valorDescontoExtra = new BigDecimal("0.05");
        }else if(situacao.equals("APROVADO")){
            valorDescontoExtra = new BigDecimal("0.02");
            }

        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao = "APROVADO";
    }

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }
    public Integer getQuantidadeItens() {return quantidadeItens;}
}
