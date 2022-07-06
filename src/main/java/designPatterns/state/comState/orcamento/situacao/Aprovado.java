package designPatterns.state.comState.orcamento.situacao;

import designPatterns.state.comState.orcamento.Orcamento;
import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal calculatValorDesconto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

    public void reprovado(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
