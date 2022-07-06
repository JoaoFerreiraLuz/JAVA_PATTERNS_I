package designPatterns.chainOfResponsability.comChainOfResponsability.imposto;

import designPatterns.chainOfResponsability.comChainOfResponsability.orcamento.Orcamento;
import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
