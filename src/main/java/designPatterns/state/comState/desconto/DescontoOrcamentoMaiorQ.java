package designPatterns.state.comState.desconto;

import designPatterns.state.comState.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoMaiorQ extends Desconto {

    public DescontoOrcamentoMaiorQ(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.12"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
