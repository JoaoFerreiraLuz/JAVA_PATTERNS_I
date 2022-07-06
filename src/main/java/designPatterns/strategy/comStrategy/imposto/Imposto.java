package designPatterns.strategy.comStrategy.imposto;

import designPatterns.strategy.comStrategy.orcamento.Orcamento;
import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
