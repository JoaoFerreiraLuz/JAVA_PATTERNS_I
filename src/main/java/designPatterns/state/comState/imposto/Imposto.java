package designPatterns.state.comState.imposto;

import designPatterns.state.comState.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
