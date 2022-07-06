package designPatterns.state.semState.imposto;

import designPatterns.state.semState.orcamento.Orcamento;
import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
