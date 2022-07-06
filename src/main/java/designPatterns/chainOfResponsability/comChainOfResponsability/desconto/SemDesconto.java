package designPatterns.chainOfResponsability.comChainOfResponsability.desconto;

import designPatterns.chainOfResponsability.comChainOfResponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    public SemDesconto (){
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return true;
    }

}
