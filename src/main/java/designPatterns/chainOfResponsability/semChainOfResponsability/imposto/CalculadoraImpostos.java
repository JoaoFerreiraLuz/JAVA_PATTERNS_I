package designPatterns.chainOfResponsability.semChainOfResponsability.imposto;

import designPatterns.chainOfResponsability.semChainOfResponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}