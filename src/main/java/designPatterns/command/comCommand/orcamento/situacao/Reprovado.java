package designPatterns.command.comCommand.orcamento.situacao;

import designPatterns.command.comCommand.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
