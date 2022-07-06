package designPatterns.command.semCommand.orcamento;

import designPatterns.command.semCommand.orcamento.situacao.EmAnalise;
import designPatterns.command.semCommand.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoextra(){
        BigDecimal valorDescontoExtra = this.situacao.calculatValorDesconto(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(Orcamento orcamento){
        this.situacao.aprovar(this);
    }

    public void reprovado(Orcamento orcamento){
        this.situacao.reprovado(this);
    }

    public void finalizar(Orcamento orcamento){
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }
    public Integer getQuantidadeItens() {return quantidadeItens;}
    public SituacaoOrcamento getSituacao() { return situacao;}
    public void setSituacao(SituacaoOrcamento situacao) { this.situacao = situacao;}
}
