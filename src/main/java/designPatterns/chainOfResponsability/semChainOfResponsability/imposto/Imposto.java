package designPatterns.chainOfResponsability.semChainOfResponsability.imposto;

import designPatterns.chainOfResponsability.semChainOfResponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
