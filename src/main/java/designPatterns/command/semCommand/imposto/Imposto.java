package designPatterns.command.semCommand.imposto;

import designPatterns.command.semCommand.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
