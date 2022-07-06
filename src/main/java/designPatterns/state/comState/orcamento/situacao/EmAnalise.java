package designPatterns.state.comState.orcamento.situacao;

import designPatterns.state.comState.orcamento.Orcamento;

import java.beans.BeanInfo;
import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    public BigDecimal calculatValorDesconto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovado(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
