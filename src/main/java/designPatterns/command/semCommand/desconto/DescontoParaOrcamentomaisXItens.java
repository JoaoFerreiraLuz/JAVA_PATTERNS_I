package designPatterns.command.semCommand.desconto;

import designPatterns.command.semCommand.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentomaisXItens extends Desconto {

    public DescontoParaOrcamentomaisXItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
