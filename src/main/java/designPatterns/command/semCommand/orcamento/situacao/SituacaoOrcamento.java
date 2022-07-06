package designPatterns.command.semCommand.orcamento.situacao;

import designPatterns.command.semCommand.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calculatValorDesconto(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovado(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
