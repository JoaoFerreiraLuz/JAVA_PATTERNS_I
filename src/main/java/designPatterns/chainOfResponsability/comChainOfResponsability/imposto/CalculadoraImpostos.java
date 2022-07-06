package designPatterns.chainOfResponsability.comChainOfResponsability.imposto;

import designPatterns.chainOfResponsability.comChainOfResponsability.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
