package designPatterns.command.semCommand.orcamento.situacao;

import designPatterns.command.semCommand.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
