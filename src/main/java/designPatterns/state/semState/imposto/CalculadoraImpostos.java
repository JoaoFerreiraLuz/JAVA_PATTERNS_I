package designPatterns.state.semState.imposto;

import designPatterns.state.semState.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
