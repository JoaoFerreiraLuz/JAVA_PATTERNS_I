package designPatterns.chainOfResponsability.semChainOfResponsability.desconto;

import designPatterns.chainOfResponsability.semChainOfResponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculaDesconto {
    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
