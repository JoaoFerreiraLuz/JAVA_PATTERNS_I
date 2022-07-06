package designPatterns.chainOfResponsability.comChainOfResponsability.desconto;

import designPatterns.chainOfResponsability.comChainOfResponsability.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculaDesconto {
    public BigDecimal calcular(Orcamento orcamento){

        Desconto cadeiaDeDescontos = new DescontoParaOrcamentomaisXItens(
                new DescontoOrcamentoMaiorQ(new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
