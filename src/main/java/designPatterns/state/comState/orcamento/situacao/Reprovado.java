package designPatterns.state.comState.orcamento.situacao;

import designPatterns.state.comState.orcamento.Orcamento;
import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
